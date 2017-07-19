[scan](http://reactivex.io/rxjs/class/es6/Observable.js~Observable.html#instance-method-scan)  
scan在源Observable上应用一个累加器函数，并且返回每一个中间结果。scan有一个可选的种子值。  
scan像reduce，但是只要源发出一个值时，它就发出目前的累加值。  
使用一个累加器函数把所有由源发出的值合并在一起。 这个累加器函数知道如何将这个新值加入到过去的累加值中。和reduce类似，只不过发出中间累加值。  
返回一个Observable, 这个Observable将一个指定的累加器函数应用到源Observable发出的每一个项目上。如果指定了一个种子值，那么这个值会被用作这个累加器的初始值。如果没有指定，那么源的第一个项目被作为种子值。  
