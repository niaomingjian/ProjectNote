[interval](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#static-method-interval)

创建一个Observable，在指定的IScheduler中，每隔指定的时间间隔产生序号。  
周期性地进行发番操作，生成序号。  
interval 返回一个Observable，生成无限升序的整数序列，两次生成之间的时间是一个常量时间。第一次生成不会立即发出，而是在第一个时间间隔之后发出。  
这个操作符默认使用async IScheduler来提供时间概念（a notion of time），不过你可以传递任意的IScheduler给它。  

默认从0开始  

Emits ascending numbers, one every second (1000ms)  
```
var numbers = Rx.Observable.interval(1000);
numbers.subscribe(x => console.log(x));
```
