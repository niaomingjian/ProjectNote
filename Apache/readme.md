# [Apache Storm](http://storm.apache.org/)

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



# [Apache Flink](https://flink.apache.org/)
