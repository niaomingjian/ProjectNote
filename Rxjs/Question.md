+ 哪些操作符的传入函数的返回值是一个普通值？哪些又是一个输入Observable？
  + 普通值

  + 输出Observable
      + `mergeMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any, concurrent: number): Observable`
      + `switchMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any): Observable`
