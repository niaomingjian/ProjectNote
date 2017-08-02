[map](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-map)  
public map(project: function(value: T, index: number): R, thisArg: any): Observable<R>  

对源Observable发出的每个值应用一个提供的project函数，并用一个Observable发出结果值。  
就像Array.prototype.map()一样，它将每个源值传递给一个转换函数并得到相应的输出值。  

和著名Array.prototype.map函数类似，这个操作符把一个映射应用于每个值，并在输出Observable中发出那个映射结果。  

```
Map every every click to the clientX position of that click

var clicks = Rx.Observable.fromEvent(document, 'click');
var positions = clicks.map(ev => ev.clientX);
positions.subscribe(x => console.log(x));
```
