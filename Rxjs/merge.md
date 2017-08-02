[merge](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-map)  
public merge(other: ObservableInput, concurrent: number, scheduler: Scheduler): Observable  

创建一个输出Observable，用来同时发出来源于每个提供的输入Observable的所有值。  
通过混合多个Observable的值到一个Observable中来将他们平展到一起。  

merge订阅每个提供的输入Observable（源Observable或以参数形式给定的Observable），简单地转发（不做任何转换）所有输入Observable的值到输出Observable。  
一旦所有输入Observable完了，输出Observable才完了。  
一个输入Observable产生的error会立即发出到输出Observable中。  

```
Merge together two Observables: 1s interval and clicks

var clicks = Rx.Observable.fromEvent(document, 'click');
var timer = Rx.Observable.interval(1000);
var clicksOrTimer = clicks.merge(timer);
clicksOrTimer.subscribe(x => console.log(x));

Merge together 3 Observables, but only 2 run concurrently

var timer1 = Rx.Observable.interval(1000).take(10);
var timer2 = Rx.Observable.interval(2000).take(6);
var timer3 = Rx.Observable.interval(500).take(10);
var concurrent = 2; // the argument
var merged = timer1.merge(timer2, timer3, concurrent);
merged.subscribe(x => console.log(x));
```

