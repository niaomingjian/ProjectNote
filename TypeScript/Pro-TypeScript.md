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

## Classes 类
前述关于TypeScript的信息已经涉及了多种使用类型信息注解你的代码的方法。  
正如你将在第2章中读到的，尽管理解所有的各种各样的类型注解很重要，TypeScript有为你做了很多工作的强大的类型接口。  
另一方面，结构化的元素会变成熟悉的（molded to the shape of your hands）工具。  
类就是这种最基本的组织你的程序的结构化元素。

### 构造器
无论你指定或不指定，TypeScript中的所有类都有一个构造器。  
如果你忽略构造器，编译器会自动加上一个。  
对于不从其他类继承的类，它的自动构造器是无参数的并会初期化所有类属性。  
当一个类继承另一个类时，自动构造器会匹配超类的签名，并且在初期化它的所有属性之前会传参给超类。  
Listing1-37展示两个有手动写的构造器的类。  
```
class Song {
    constructor(private artist: string, private title: string) {
 
    }
    play() {
        console.log('Playing ' + this.title + ' by ' + this.artist);
    }
}
 
class Jukebox {
    constructor(private songs: Song[]) {
    }
 
    play() {
        var song = this.getRandomSong();
        song.play();
    }
 
    private getRandomSong() {
        var songCount = this.songs.length;
        var songIndex = Math.floor(Math.random() * songCount);
 
        return this.songs[songIndex];
    }
}
 
var songs = [
    new Song('Bushbaby', 'Megaphone'),
    new Song('Delays', 'One More Lie In'),
    new Song('Goober Gun', 'Stereo'),
    new Song('Sohnee', 'Shatter'),
    new Song('Get Amped', 'Celebrity')
];
 
var jukebox = new Jukebox(songs);
 
jukebox.play();
```
它比本章中的其他代码稍微长点儿，不过在解释每个方面之前值得读一读。  
首先会打击到你的是构造器的参数没有映射到成员变量。  
如果你用访问修饰符作为构造器参数的前缀，比如private,它会自动为你映射的。  
你可以引用这些构造器参数就像它们在类中声明为了属性一样。  
比如this.title可以在Song类中的任何地方使用来获得song实例的名字。  
Listing1-38展示了等价的代码——手动映射参数。不过这仅仅用于展示这一点，会创建很多冗余代码，你应该避免这种方式。  

```
class Song {
 
    private artist: string;
    private title: string;
 
    constructor(artist: string, title: string) {
        this.artist = artist;
        this.title = title;
    }
    play() {
        console.log('Playing ' + this.title + ' by ' + this.artist);
    }
}
```
### 访问修饰符
访问修饰符可以用于改变一个类中的属性和方法的可见性。  
默认情况下，属性和方法是public的。所以你没有必要给属性和方法添加public关键字前缀。  
你确实需要为构造器的参数添加public关键字前缀， 如果你想要它们自动映射到public属性的话。  

要隐藏一个属性和方法，你要给它加上private关键字。  
这限制了访问性只在类内部，成员不会出现在类的自动完成清单（autocompletion lists）中。  
任何外部访问都会导致编译错误。  
当你把一个类成员标记为private时，它甚至不能被子类看到。  
如果你想要从子类中访问一个属性或方法的话，它必须被设成public★。　　
当你用private访问修饰符时，TypeScript编译器会执行成员的隐私性。  
但是运行时没有可见性的强制。因为它在每个类的私有成员中要求一个附加的闭合（closure）。  
有引入protected关键字的计划，它将使类成员在类和子类中可以访问——不过这个特性在1.0版本之后考虑。  
你可以在[TypeScript Codeplex](http://typescript.codeplex.com/workitem/125)项目中跟踪这个特性。  

### 属性和方法 Properties and Methods
在TypeScript类中实例属性一般在构造器之前声明。  
一个属性定义由三部分组成：可选的访问修饰符，标识符，类型注解。  
比如： public name： string;  
你也可以用一个值来初期化这个属性： public name:string='Jane';  
当你的程序被编译了，属性的初始化（initializers）就被移到了构造器中。在类中实例属性可以使用关键字this来访问。  
如果属性是public的，可以使用实例的名字来访问。  

你也可以为你的类增加静态属性，就像定义实例属性一样，不过在访问修饰符和标识符之前加上了static关键字。







