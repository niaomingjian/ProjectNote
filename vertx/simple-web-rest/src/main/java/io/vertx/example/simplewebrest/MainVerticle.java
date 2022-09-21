package io.vertx.example.simplewebrest;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.MultiMap;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.kafka.client.consumer.KafkaReadStream;
import io.vertx.kafka.client.producer.KafkaWriteStream;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.*;

public class MainVerticle extends AbstractVerticle {

    private final Logger logger = LoggerFactory.getLogger(MainVerticle.class);


    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());
        router.post("/test").handler(this::handleTest);
        router.route("/*").handler(this::handleAll);

        vertx.createHttpServer().requestHandler(router).listen(8180);
    }

    private void handleAll(RoutingContext routingContext) {

        HttpServerResponse response = routingContext.response();

        HttpServerRequest request = routingContext.request();

        JsonObject record = new JsonObject();
        record.put("path", request.path());
        record.put("method", request.method().toString());
        JsonObject headers = multiMapToJsonObject(request.headers());
        record.put("headers", headers);
        record.put("params", multiMapToJsonObject(request.params()));
        record.put("body", routingContext.getBodyAsString());

        logger.info("### 提交成功如下数据：");
        logger.info(record.encodePrettily());

        response.putHeader("content-type", "application/json").end(record.encodePrettily());

    }

    private JsonObject multiMapToJsonObject(MultiMap multiMap) {
        JsonObject result = new JsonObject();
        if (multiMap == null) {
            return result;
        }

        multiMap.names().forEach(name -> {
            List<String> values = multiMap.getAll(name);
            result.put(name, values);
        });

        return result;
    }

    private void handleTest(RoutingContext routingContext) {

        JsonObject jsonObject = routingContext.getBodyAsJson();
        MultiMap headers = routingContext.request().headers();
        MultiMap params = routingContext.request().params();

        JsonObject record = new JsonObject();

        HttpServerResponse response = routingContext.response();
        JsonArray headerJA = new JsonArray();
        headers.forEach(header -> {
            List<String> values = headers.getAll(header.getKey());
            for (String value : values) {
                JsonObject headerJO = new JsonObject().put(header.getKey(), value);
                headerJA.add(headerJO);
            }
        });
        record.put("headers", headerJA);

        JsonArray paramJA = new JsonArray();
        params.forEach(param -> {
            List<String> values = params.getAll(param.getKey());
            for (String value : values) {
                JsonObject paramJO = new JsonObject().put(param.getKey(), value);
                paramJA.add(paramJO);
            }
        });
        record.put("params", paramJA);
        record.put("body", jsonObject);

        logger.info("### 提交成功如下数据：");
        logger.info(record.encodePrettily());

        response.putHeader("content-type", "application/json").end(jsonObject.encodePrettily());
    }

}
