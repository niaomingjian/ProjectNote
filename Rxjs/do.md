[do](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-do)  
public do(nextOrObserver: Observer | function, error: function, complete: function): Observable  

对每个源Observable的输出执行一个副作用，不过返回一个和源一样的Observable。  

截获源Observable的每个输出，不过返回一个和源一样的Observable。  

返回源Observable的镜像Observable，but modified？？？，提供的Observer被调用来为源Observable发出的每个值，error，完了 执行一个副作用。  
前述的Observer或处理器中抛出的任何error，会安全地送给输出Observable的error path。？？？  

这个操作符对于调试你的Observable来看正确的值或执行其他的副作用很有用。  

注意： 它和Observable上的subscribe不同。如果do返回的Observable没有被订阅，那么由Observer指定的副作用将不会发生。  
因而do只简单侦听存在的执行，而不会像subscribe一样触发一个执行。  

```
Map every every click to the clientX position of that click, while also logging the click event

var clicks = Rx.Observable.fromEvent(document, 'click');
var positions = clicks
  .do(ev => console.log(ev))
  .map(ev => ev.clientX);
positions.subscribe(x => console.log(x));
```



