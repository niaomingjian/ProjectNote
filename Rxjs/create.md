[create](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#static-method-create)  
public static create(onSubscription: function(observer: Observer): TeardownLogic): Observable  

创建一个新的Observable,当一个Observer订阅它时它会执行指定的函数。  
create将一个onSubscription函数转换为一个实际的Observable。  
无论何时某人订阅了这个Observable，这个函数会被调用，并用一个Observer实例作为第一个也是唯一的参数。  
onSubscription然后应该调用Observers的next，error,complete方法。  

调用next（value），会将value发给observer。  
调用complete意味着Observable完成了发出并将不会做任何事了。  
调用error意味着有东西出错了。传递给error方法的值应该提供说明到底发生了什么的详细信息。  

一个结构良好的Observable能够通过next方法发出和它需要一样多的值，而complete和error方法只会被调用一次并且之后就没有任何调用了。  
如果你在Observable已经完结或因失败结束后，尝试去调用next，complete,error方法的话，这些调用会被忽略来保护所谓的`Observable Contract`。  
注意在任何时候下都不要求你去调用complete，而是根据你的需要来决定——创建一个永不结束的Observable是非常好的。  

onSubscription可以选择性地返回一个函数或者含有unsubscribe方法的对象。  
在这两个情况下，当对Observable的订阅被取消时，函数或方法将会被调用并且应该被用来清理所有的资源。  
因而，比如，如果你正在你的自定义Observable中使用setTimeout，当某人取消订阅时，你可以清除计划的超时（planned timeout）,  
那么它将不会无谓地触发并且浏览器（或其他环境）就不会在根本就没有人侦听的定时事件上浪费计算资源。  
 
大部分的时间里，你不应该使用create。因为对于大多数使用场景，已有的操作符允许你创建一个Observable。  
话虽如此，如果你有特定需求的话，create是个允许你创建任何Observable的底层机制。  

TypeScript signature issue（签名问题）  
因为Observable继承的类已经定义了静态的create方法，并且使用不同的类型签名来将合适的签名分给Observable.create是不行的。 ？？？ 
正是由于这个原因，它有很通用的类型`Function`，因而传递给create的函数将不会做类型检查，除非你显示地声明它应该有什么签名。  
当使用TypeScript时，我们推荐对传递给create的函数进行类型签名声明，像`(observer: Observer) => TeardownLogic`。  
Observer和TeardownLogic是用库提供的接口。  


Emit three numbers, then complete.

```
var observable = Rx.Observable.create(function (observer) {
  observer.next(1);
  observer.next(2);
  observer.next(3);
  observer.complete();
});
observable.subscribe(
  value => console.log(value),
  err => {},
  () => console.log('this is the end')
);

// Logs
// 1
// 2
// 3
// "this is the end"
```

Emit an error

```
const observable = Rx.Observable.create((observer) => {
  observer.error('something went really wrong...');
});

observable.subscribe(
  value => console.log(value), // will never be called
  err => console.log(err),
  () => console.log('complete') // will never be called
);

// Logs
// "something went really wrong..."
```

Return unsubscribe function

```
const observable = Rx.Observable.create(observer => {
  const id = setTimeout(() => observer.next('...'), 5000); // emit value after 5s

  return () => { clearTimeout(id); console.log('cleared!'); };
});

const subscription = observable.subscribe(value => console.log(value));

setTimeout(() => subscription.unsubscribe(), 3000); // cancel subscription after 3s

// Logs:
// "cleared!" after 3s

// Never logs "..."
```






