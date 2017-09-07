[throttleTime](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-throttleTime)  
public throttleTime(duration: number, scheduler: Scheduler): Observable<T>  

从源Observable发出一个值，然后在duration时间内忽略后续的源值，然后重复这个过程。  
让一个值通过，然后在下一个duration时间内忽略源值。  
当内部定时器无效时，throttleTime发出源Observable的值在输出Observable中，并且当定时器有效时忽略源值。  
初始时，这个定时器是无效的。第一个源值一到达，它就被转发给输出Observable，然后定时器就有效了。  
在duration时间（或内部可选的scheduler确定的时间单元）之后，定时器就无效了。对于下一个源值这个过程会重复。  
可选择用IScheduler来管理定时器。  

返回： 一个执行throttle操作来限制源发出数据速率的Observable。
