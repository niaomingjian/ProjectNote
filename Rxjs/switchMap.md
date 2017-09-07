[switchMap](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-switchMap)  
public switchMap(project: function(value: T, ?index: number): ObservableInput, resultSelector: function(outerValue: T, innerValue: I, outerIndex: number, innerIndex: number): any): Observable  
[REF learnrxjs](https://www.learnrxjs.io/operators/transformation/switchmap.html)  

当一个新的内部Observable发出了，switchMap会停止发出之前的内部Observable发出的项目并开始发出来自新的内部Observable的项目。  
switchMap有截断（取消）前Observable的作用。

Projects each source value to an Observable which is merged in the output Observable, emitting values only from the most recently projected Observable.  
将每一个源值投影为一个内部Observable，它会被合并到输出Observable中，而输出Observable只会发出来自最新的被投影Observable。  

Maps each value to an Observable, then flattens all of these inner Observables using switch.  
将每个值映射为一个内部Observable，然后使用switch来扁平化所有的这些内部Observable。  


Returns an Observable that emits items based on applying a function that you supply to each item emitted by the source Observable, where that function returns an (so-called "inner") Observable. Each time it observes one of these inner Observables, the output Observable begins emitting the items emitted by that inner Observable. When a new inner Observable is emitted, switchMap stops emitting items from the earlier-emitted inner Observable and begins emitting items from the new one. It continues to behave like this for subsequent inner Observables.  

返回一个Observable，它发出的是将你提供的函数应用于由源Observable发出的项目后得到的项目。  
这个项目是那个函数返回的，是一个所谓的内部Observable。  
每次它观察到一个内部Observable时，输出Observable就开始发出这个内部Observable发出的项目。  
当一个新的内部Observable被发出时，switchMap就停止发出来自早前的内部Observable发出的项目，并开始发出来自这个新的内部Observable的项目。  
它会持续地这样处理后续的内部Observable。  


内部Observable <=> 被投影Observable

+ switch和switchMap的区别：  
switch中的内部Observable的产生方式是由源Observable定义好的。  
switchMap中的内部Observable的产生方式是通过一个函数提供给switchMap的。  
一般会使用switchMap，因为内部Observable可以根据自己的需求来定义生成。  
