[switch](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-switch)  
public switch(): Observable<T>  

switch订阅的是会发出Observables的Observable, 也就是高阶Observable。  
每当它观察到一个内部发出的Observable时，输出Observable（output Observable）会订阅这个内部Observable，并且开始发出由这个内部Observable发出的项目。  
到目前为止，它的行为很像mergeAll。  
然而当一个新的内部Observable发出时，switch会取消订阅先前发出的内部Observable，并订阅这个新的内部Observable及开始发出来自它的项目。  
它会持续地这样处理后续的内部Observable。  

高阶Observable  
内部Observable  
输出Observable  

Converts a higher-order Observable into a first-order Observable by subscribing to only the most recently emitted of those inner Observables.  
通过只订阅最新发出的内部Observable，将高阶Observable转换为第一阶Observable。  

Flattens an Observable-of-Observables by dropping the previous inner Observable once a new one appears.  
当一个新的内部Observable出现时就丢掉之前的内部Observable，来扁平化Observable的Observable。  
