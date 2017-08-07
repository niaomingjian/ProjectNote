## Interface 接口
TypeScript interfaces可以用于几个目的。  
如你所愿，一个接口可以被用来作为一个抽象类型，它可以被具体类实现。  
它也可以用在TypeScript程序中被用来定义任何结构。  
Interfaces也是编译块（building blocks）,用来定义一些并不是由TypeScript写的第三方库或框架提供的操作。  
在第8章中有关于如何书写环境声明（ambient declarations）来定义外部代码的详细内容。  

Interfaces由interface关键字来声明并且包含一些注解（a series of annotations）来描述它们要表现的契约。  
这些注解不仅可以描述你想要的属性和函数，还有构造器和索引器。  
当用Interface来描述你想实现的类时，你不需要定义构造器和索引器。  
这些特性是用来帮助你描述不太类似与类结构的外部代码的。这些在第2章中会讨论到。  

Listing1-34列举了一组Interface来描述vehicle, passengers, location和destination。  
属性和方法是用本章中已经用过的熟悉的类型注解声明的。  
构造器是用new关键字定义的。  

```
interface Point {
        // Properties
        x: number;
        y: number;
}
 
interface Passenger {
        // Properties
        name: string;
}

interface Vehicle {
        // Constructor
        new() : Vehicle;
                 
        // Properties
        currentLocation: Point;
         
        // Methods
        travelTo(point: Point);
        addPassenger(passenger: Passenger);
        removePassenger(passenger: Passenger);
}
```

Interface不会产生任何编译后的JavaScript代码;这是由于类型擦除（type erasure）的缘故，在第2章中会描述。  
Interface在设计时被用来提供自动完成和编译时提供类型检查。  
就像enumeration，Interface是开放的（open）,所有在公共根（common root）中的声明被合并到一个Interface中。  
这意味着你必须确保组合后的接口是有效的。你不能在同一个接口的多个块中声明相同的属性（你会得到一个"duplicate identifier"错误），不能定义相同的方法（尽管你可以对已存在的方法添加重载）。  

当你定义自己的程序时，在多个块中声明一个接口不是特别有用。不过当要扩展内置的定义或外部代码时，这个特性就很有价值。  
比如，NodeList中可访问的项目有：item方法和length属性。  
内置的接口定义如下，包含length属性，item方法和索引器。  
```
interface NodeList {
    length: number;
    item(index: number): Node;
    [index: number]: Node;
}
```
如果接口是封闭的，你将被TypeScript的标准库的契约定义所限。  
附加的接口块可以扩展这个内置的NodeList接口来增加一个原来不能访问的onclick属性。  
就编译器而言，定义在标准库中的接口和定义在你的TypeScript中的接口就是一个接口。  
在第4章中，你可以找到更多关于扩展已有对象的内容，以及在第5章中有关扩展原本浏览器的功能的内容。  
```
interface NodeList {
    onclick: (event: MouseEvent) => any;
}
 
var nodeList = document.getElementsByTagName('div');
 
nodeList.onclick = function (event: MouseEvent) {
    alert('Clicked');
};
```
再次重申一下接口不仅可以用来描述你想要在一个类中实现的契约，而且可以被用来在你的程序中描述任何你所设想的结构，无论它们是函数，变量，对象或它们的组合。  
当一个方法接受一个options对象作为参数时——这在JavaScript框架中非常常见，比如jQuery，一个接口被用来为这个复杂的对象参数提供自动实现。  

在TypeScript中有另外一个和接口有关的稍微模糊的特性值得注意。  
一个接口可以从一个类继承，就像一个子类从一个超类继承一样。  
当你这样做的话，接口会从类的所有成员继承，而不包含任何实现。  
任何增加到类中东西都会增加到接口中。  
当和泛型一起使用时——本章后面会解释，你将会发现这个特性特别有用。  

## Interface 类








