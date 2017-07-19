[RxJS](http://reactivex.io/rxjs/manual/overview.html)

Rxjs是通过使用**可观察序列**（observable sequences），用于构建**异步的基于事件的程序**的一个库。  
它提供了一个核心类型**Observable**, 卫星类型（satellite types）(**Observer, Schedulers, Subjects**) 以及受Array#extras(map, filter, reduce, every, 等)启发的**操作符**来像处理集合一样处理异步事件。  

把RxJS看作是处理事件的Lodash。  

ReactiveX把**观察者模式和迭代器模式**以及**函数式编程和集合**组合在一起来实现对事件序列的管理。  

RxJS中解决异步事件管理的本质概念有：  
Observable: 表示可调用的未来值或事件的集合。  
Observer: 一组回调， 一组知道如何侦听由Observable传递的值的回调。  
Subscription: 表示一个Observale的执行，主要用于取消这个执行。  
Operators: 纯函数，允许以函数式编程风格中像map, filter, concat, flatMap等这样的操作处理集合的纯函数。  
Subject: 等价于一个事件发射者（EventEmitter）, 也是向多个Observers广播一个值或事件的唯一方式。  
Schedulers: 集中式的调度者，来控制并发，允许我们协调运算何时发生在如setTimeout, requestAnimationFrame, 或其他中。  

```
var button = document.querySelector('button');
Rx.Observable.fromEvent(button, 'click')
  .subscribe(() => console.log('Clicked!'));
```
Rx.Observable.fromEvent(button, 'click') 创建一个Observable  
Rx.Observable.fromEvent(button, 'click').subscribe() 返回一个Subscription  
() => console.log('Clicked!') 是一个Observer  

通过纯函数产生值这种能力使得RxJS很强大。这意味着你的代码不易出错。  
通常你会创建非纯函数，你的代码的其他片段会弄混你的状态。
```
var count = 0;
var button = document.querySelector('button');
button.addEventListener('click', () => console.log(`Clicked ${++count} times`));
```
使用RxJS你可以隔离状态。  
```
var button = document.querySelector('button');
Rx.Observable.fromEvent(button, 'click')
  .scan(count => count + 1, 0)
  .subscribe(count => console.log(`Clicked ${count} times`));
```
这个scan操作符就像arrays的ruduce。  
它会取一个值（count），这个值被暴露给一个回调（count + 1）。  
这个回调的返回值然后会在下一次回调运行时成为下一个暴露的值。  
[scan](https://github.com/niaomingjian/ProjectNote/blob/master/Rxjs/scan.md)  
scan在源Observable上应用一个累加器函数，并且返回每一个中间结果。scan有一个可选的种子值。  




