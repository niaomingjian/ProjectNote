[of](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#static-method-of)

创建一个Observable,立即一个接一个地发出你指定的参数，然后发出一个结束通知。  
发出你提供的参数，然后结束。  
这个操作符对于创建一个 只是发出给定的参数 而后一个结束通知的 简单的Observable很有用。  
它也可以用来和别的Observables进行组合，比如和concat.  
它默认使用`null` IScheduler，这意味着`next`通知是**同步发出的**(Question)。  
使用不同的IScheduler可以决定这些通知何时被发出。  

Emit 10, 20, 30, then 'a', 'b', 'c', then start ticking every second.
```
var numbers = Rx.Observable.of(10, 20, 30);
var letters = Rx.Observable.of('a', 'b', 'c');
var interval = Rx.Observable.interval(1000);
var result = numbers.concat(letters).concat(interval);
result.subscribe(x => console.log(x));
```
