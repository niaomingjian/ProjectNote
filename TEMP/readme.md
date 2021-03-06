# spring boot
+ [Spring Boot 2.0 Release Notes](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes)
+ [spring-boot milestones](https://github.com/spring-projects/spring-boot/milestones?direction=asc&sort=due_date&state=open)
+ [Spring Boot 2.0 Migration Guide](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Migration-Guide)
+ [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/2.0.0.BUILD-SNAPSHOT/reference/htmlsingle/)

### dependencies(v2.0.0.M5)
+ [spring-boot-dependencies/pom.xml](https://github.com/spring-projects/spring-boot/blob/v2.0.0.M5/spring-boot-project/spring-boot-dependencies/pom.xml)
+ [spring-boot/pom.xml](https://github.com/spring-projects/spring-boot/blob/v2.0.0.M5/pom.xml)


# elasticsearch
+ [Elasticsearch 5.0.0 released](https://www.elastic.co/blog/elasticsearch-5-0-0-released)
+ [Breaking changes](https://www.elastic.co/guide/en/elasticsearch/reference/5.5/breaking-changes-5.0.html)
  + migration-plugin
+ [Strings are dead, long live strings!](https://www.elastic.co/blog/strings-are-dead-long-live-strings)
+ [Suggester changes](https://www.elastic.co/guide/en/elasticsearch/reference/5.5/breaking_50_suggester.html)
+ [Completion Suggester](https://www.elastic.co/guide/en/elasticsearch/reference/5.5/search-suggesters-completion.html)
+ [How can i get unique suggestions without duplicates when i use completion suggester?](https://stackoverflow.com/q/42391207/4983501)
+ [Autocomplete suggestion no longer removes duplicate entries as in ES 2.3](https://github.com/elastic/elasticsearch/issues/22912)

# cassandra
+ [http://archive.apache.org/dist/cassandra/](http://archive.apache.org/dist/cassandra/)
+ [spring data cassandra New & Noteworthy](https://docs.spring.io/spring-data/cassandra/docs/2.0.0.RELEASE/reference/html/#new-features)
# Mockito
+ [Using PowerMock with Mockito](https://github.com/powermock/powermock/wiki/Mockito)
+ [What's new in Mockito 2](https://github.com/mockito/mockito/wiki/What%27s-new-in-Mockito-2)
+ [Incompatible changes with 1.10](https://github.com/mockito/mockito/wiki/What%27s-new-in-Mockito-2#incompatible-changes-with-110)
+ [Migration to Mockito 2.1](https://asolntsev.github.io/en/2016/10/11/mockito-2.1/)


### Notes
spring-data-elasticsearch 2.1.3->3.0.0  
spring-data-cassandra 1.5.3->2.0.0  

### TODOs
+ [Wrong pagination using Spring Data ElasticSearch 3.0.0.BUILD-SNAPSHOT with Elasticsearch 5.4.0](https://stackoverflow.com/q/45754909/4983501)
+ [the totalPages returns always 1](https://jira.spring.io/browse/DATAES-413)

+ suggest 查询的字段不存在的话  
elasticsearch 2.4 => hits为0  
elasticsearch 5.5.2 => illegal_argument_exception/no mapping found for field [xxx]  


### scripts
+ org.springframework.data.elasticsearch.core.ElasticsearchTemplate.doSearch(SearchRequestBuilder, SearchQuery) line: 900

