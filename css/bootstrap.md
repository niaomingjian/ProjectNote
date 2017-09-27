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
+ 
