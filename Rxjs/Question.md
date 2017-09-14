+ 哪些操作符的传入函数的返回值是一个普通值？哪些又是一个输入Observable？
  + 普通值

  + 输出Observable
      + `concatMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any): Observable`
      => in a serialized fashion waiting for each one to complete before merging the next  
       不会丢掉数据，按顺序输出。  
      + `mergeMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any, concurrent: number): Observable`  
       不会丢掉数据，但可能交错着输出。（后一个Observable可能会先于前一个的）  
      + `switchMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any): Observable`  
       会按顺序输出，可能会丢掉数据。（后一个Observable可能会截断前一个的）  
