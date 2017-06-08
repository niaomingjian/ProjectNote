
\_all field是个特殊的catch-all字段。将所有其他的字段的值用**空格作为分隔符**连接在一起变成一个**大字符串**。然后会**被分析**（analyzed）和**索引**(indexed),但**不会被存储**。这意味着它可以被检索，但不能被取出来。

\_all field 允许你在文档中检索所有的值，而不管是在哪个字段中包含了那个值。这在开始一个全新的数据集时是一个有用的选项。

所有的字段被当做字符串

\_all字段就是个text 字段，接受其他string字段接受的相同参数，包括analyzer, term_vectors, index_options, 和store。

\_all字段可以很有用，特别是在使用简单过滤探索新数据时。然而，通过拼接字段值到一个大字符串中，\_all字段会**丢掉短字段（高相关）和长字段（低相关）间的差异**。对于搜索相关性很重要的用例，最好特意地查询单独的字段。

\_all字段不是免费的：它需要额外的CPU周期并且使用更多的磁盘空间。如果不需要，可以完全禁用或者在每个字段上自定义。

默认情况下，query_string和simple_query_string查询在\_all field字段上查询，除非指定了另一个字段：

    GET _search
    {
      "query": {
        "query_string": {
          "query": "john smith 1970"
        }
      }
    }

 在URI search requests中的?q=参数也是一样（在内部重写为query_string查询）：
 
     GET _search?q=john+smith+1970

其他的查询，比如match和term查询要求你显式指定\_all字段。

