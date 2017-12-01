# [Apache Storm](http://storm.apache.org/)

### [Apache Storm 1.1.1 - Documentation](http://storm.apache.org/releases/1.1.1/)

machine  
nodes  
JVMs(worker processes)  
Threads(executors)

1 topology => n worker  
n executor => 1 spout/bolt  
task(spout/bolt)  

Trident supports stateful stream processing, while pure Storm is a stateless processing framework.  
To achieve exactly-once processing, Trident processes the input stream in small batches.  

stream  
batch  
partition  
group  

+ Tuple:  
可以自定义值的类型。使用自定义的类型就用提供serializer并注册到Storm中。  
+ Topology:  
nodes are spouts or bouts and edges are a stream grouping which connects them.  
+ Stream:  
a sequence of unbounded tuples  
+ Spout:  
A Spout can produce more than one stream by defining the declareStream method of OutputFieldDeclare  
+ types of spouts:  
Reliable and Unreliable  
+ Bolt  
a processing unit of Storm  
A bolt can emit more than one stream by the defining declareStream method of OutputFieldDeclare  
You can't subscribe to all streams at once. You must subscribe to them one by one.  




# [Apache Flink](https://flink.apache.org/)
