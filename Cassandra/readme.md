+ [Generating SSTable using CQLSSTableWriter](https://www.datastax.com/dev/blog/using-the-cassandra-bulk-loader-updated)
+ [sstableloader (Cassandra bulk loader)](https://docs.datastax.com/en/cassandra/2.1/cassandra/tools/toolsBulkloader_t.html)
+ [NoHostAvailableException: All host(s) tried for query failed](https://stackoverflow.com/a/33209236/4983501)

### Notes
+ Note: Non-system keyspaces don't have the same replication settings, effective ownership information is meaningless  
  => nodetool status **my_keyspace**
