[mergeAll](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-mergeAll)

public mergeAll(concurrent: number): Observable  

Converts a higher-order Observable into a first-order Observable which concurrently delivers all values that are emitted on the inner Observables.  

将一个高阶Observable转换为一个第一阶Observable，它会并发地发出由内部Observables发出的所有值。  

Flattens an Observable-of-Observables.  

扁平化一个Observable的Observable。  

mergeAll subscribes to an Observable that emits Observables, also known as a higher-order Observable. Each time it observes one of these emitted inner Observables, it subscribes to that and delivers all the values from the inner Observable on the output Observable. The output Observable only completes once all inner Observables have completed. Any error delivered by a inner Observable will be immediately emitted on the output Observable.  

mergeAll订阅的是会发出Observables的Observable, 也就是高阶Observable。  
每当它观察到一个内部发出的Observable时，它就订阅这个Observable，并在输出Observable中发出来自这个内部Observable的所有值。  
这个输出Observable只会在所有内部Observable完了时才会完了。  
一个内部Observable发出的任何error都会被立即发出给输出Observable。
