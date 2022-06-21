###
# vert.x docker example using a Java verticle packaged as a fatjar
# To build:
#  docker build -t reg.k8s.rf.io/rf/simple-web-rest:test . && docker push reg.k8s.rf.io/rf/simple-web-rest:test
# To run:
#   docker run -t -i reg.k8s.rf.io/rf/simple-web-rest:test
###

FROM java:8-jre

ENV VERTICLE_FILE simple-web-rest-4.1.0-fat.jar

# Set the location of the verticles
ENV VERTICLE_HOME /usr/verticles

EXPOSE 8180

# Copy your fat jar to the container
COPY target/$VERTICLE_FILE $VERTICLE_HOME/
COPY my-conf.json $VERTICLE_HOME/conf/

# Launch the verticle
WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $VERTICLE_FILE -conf conf/my-conf.json"]
