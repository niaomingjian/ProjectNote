[switchMap](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-switchMap)  
public switchMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any): Observable  
[REF learnrxjs](https://www.learnrxjs.io/operators/transformation/switchmap.html)  

当一个新的内部Observable发出了，switchMap会停止发出之前的内部Observable发出的项目并开始发出来自新的内部Observable的项目。  
switchMap有截断（取消）前Observable的作用。
