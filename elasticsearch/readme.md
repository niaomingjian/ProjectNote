### Errors
+ 从ES2.4升级到ES5.5后，再从5.5降到ES2.4时，ES启动失败
```
 ElasticsearchException[failed to read [id:109, legacy:false, file:/usr/share/elasticsearch/data/elasticsearch/nodes/0/_state/global-109.st]]; nested: IOException[failed to read [id:109, legacy:false, file:/usr/share/elasticsearch/data/elasticsearch/nodes/0/_state/global-109.st]]; nested: CorruptStateException[Format version is not supported (resource SimpleFSIndexInput(path="/usr/share/elasticsearch/data/elasticsearch/nodes/0/_state/global-109.st")): 1 (needs to be between 0 and 0)];
```
=> [ES 1.7 - failed to read local state, exiting... org.elasticsearch.ElasticsearchException](https://github.com/elastic/elasticsearch/issues/16818)
