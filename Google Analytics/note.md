# Google Analytics

### gtag.js
gtag.js(Global Site Tag)是Universal Analytics的接口形式，不是它的更新版本。

+ gtag.js tag is a Beta version(2017-09-05)
+ it doesn’t replace GTM
+ it is not covered by a minimum SLA
+ at present it doesn’t allow to manage external tags out of GA
+ at present it generates the same functions of analytics.js
+ it doesn’t support Tasks

Measurement Protocol(Google Universal Analytics’ data collection API)

In those 7 years, the JavaScript-powered digital marketing industry has massively embraced JSON as a replacement for XML for configuration and data exchange.

#### Event Tracking
+ category
+ action
+ label
+ value

### [Adding analytics.js to Your Site](https://developers.google.com/analytics/devguides/collection/analyticsjs/#the_javascript_tracking_snippet)

+ the ga() command queue
+ create a new tracker object
+ send a pageview to Google Analytics

### analytics.js 的工作原理

ga 命令队列  
函数也是对象  
ga 函数对象上的q属性（q 数组）  
规避了异步代码的诸多复杂性  
这些调用几乎不可能报错  







