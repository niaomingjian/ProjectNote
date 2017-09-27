Grid System

Bootstrap有一个响应式的，移动优先的流式栅格系统（fluid grid system）。当设备或视窗大小增加时，它可以适当地扩展到12列。它有用来简单布局的已定义的class，以及强大的用于生成更加语义化布局的mixins。  
引言  
栅格系统通过一系列的包含内容的行列来创建页面布局。下面是Bootstrap栅格系统如何工作的：  
+ 行（rows）必须放置在一个.container（固定宽度）或.container-fluid（全宽度）中来进行适当的对其和填充。
+ 使用行（rows）来创建水平的列组（groups of columns）。
+ 预定义的grid classes，比如.row、.col-xs-4可用于快速创建格子布局(grid layouts)。Less mixins也可以被用于更语义化的布局。
+ 列（columns）通过填充(padding)创建水槽(gutters)(列内容之间的间隙)。That padding is offset in rows for the first and last column via negative margin on .rows.
+ 负margin正是下面例子outdented的原因。使得grid列的内容和无grid的内容排在一起。
+ grid列通过指定你想要横跨的12个可用列的数字来创建。比如使用.col-xs-4来创建3个相等的列。
+ 如果超过12列被放在一行中，每组中的额外列将会作为一个单元折到一个新行。
+ grid classes应用到屏宽大于等于断点大小的设备，并且会覆写作用于小设备的grid classes。因而，比如，如果.col-lg-\*没有出现的话，那么应用任何.col-md-\* class到一个元素不仅会影响它在中等设备上的式样，也会影响大设备。
看一些例子将这些原理用到你的代码中。  
Media queries  
我们用下面的media queries于我们的Less文件中，为我们的grid system创建关键断点。
```
/* 小于768px*/
/* 在Bootstrap中是默认值，不要media query */

/* 小设备(平板, 大于等于768px) */
@media (min-width: @screen-sm-min) { ... }

/* 中设备(desktops, 大于等于992px) */
@media (min-width: @screen-md-min) { ... }

/* 大设备 (large desktops, 大于等于1200px) */
@media (min-width: @screen-lg-min) { ... }
```
我们偶尔会在这些media query上扩展包含一个max-width来限制CSS到更窄的一组设备。
```
@media (max-width: @screen-xs-max) { ... }
@media (min-width: @screen-sm-min) and (max-width: @screen-sm-max) { ... }
@media (min-width: @screen-md-min) and (max-width: @screen-md-max) { ... }
@media (min-width: @screen-lg-min) { ... }
```
[Grid options](https://bootstrapdocs.com/v3.3.6/docs/css/#grid-options)  
Example: Stacked-to-horizontal  
使用一组.col-md-* grid classes就可以创建一个基础的grid system。它在移动设备或平板设备上堆叠，在desktop设备上变为水平。将grid columns放在任意的.row中。
Example: Fluid container  
通过将.container改为.container-fluid来将固定宽度的grid布局变为全宽度的布局。  
Example: Mobile and desktop  
不想在小设备上简单堆叠你的列？通过添加.col-xs-\* .col-md-\*到你的列中来使用额外的小中设备grid classes。看看下面的例子是如何工作的。  
Example: Mobile, tablet, desktop  





