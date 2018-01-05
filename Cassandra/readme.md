+ [Generating SSTable using CQLSSTableWriter](https://www.datastax.com/dev/blog/using-the-cassandra-bulk-loader-updated)
+ [sstableloader (Cassandra bulk loader)](https://docs.datastax.com/en/cassandra/2.1/cassandra/tools/toolsBulkloader_t.html)
+ [NoHostAvailableException: All host(s) tried for query failed](https://stackoverflow.com/a/33209236/4983501)

### Notes
+ Note: Non-system keyspaces don't have the same replication settings, effective ownership information is meaningless  
  => nodetool status **my_keyspace**

+ Provides statistics about tables  
  => [`nodetool cfstats <keyspace>.<table> ...  -H`](http://docs.datastax.com/en/cassandra/2.1/cassandra/tools/toolsCFstats.html)  
  => [`nodetool tablestats keyspace1.standard1`](https://docs.datastax.com/en/cassandra/3.0/cassandra/tools/toolsTablestats.html)
  
+ [`nodetool cleanup`](https://docs.datastax.com/en/cassandra/3.0/cassandra/tools/toolsCleanup.html)  
  Cleans up keyspaces and partition keys no longer belonging to a node  
  
+ [Initializing a cluster](https://docs.datastax.com/en/cassandra/3.0/cassandra/initialize/initTOC.html)  
