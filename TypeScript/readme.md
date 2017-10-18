[TypeScript Handbook（中文版）](https://zhongsp.gitbooks.io/typescript-handbook/content/)  
[TypeScript Documentation](https://www.typescriptlang.org/docs/home.html)  
[Top 10 TypeScript Books For Web Developers](http://whatpixel.com/top-10-typescript-books/)

# [模块](https://zhongsp.gitbooks.io/typescript-handbook/content/doc/handbook/Modules.html)[Modules](https://www.typescriptlang.org/docs/handbook/modules.html)

1. TypeScript 1.5里术语名已经发生了变化。 “内部模块”现在称做“命名空间”。 “外部模块”现在则简称为“模块”  
2. 模块在其自身作用域中执行。在模块需要export导出，在其他模块中需要import导入才可见。  
3. 使用模块加载器导入模块。
4. 

# [基础类型](https://zhongsp.gitbooks.io/typescript-handbook/content/doc/handbook/Basic%20Types.html)

1. `let isDone: boolean = false;`  
2. 数组 number[], Array<number>  
3. 元组 Tuple, let x: [string, number];  
4. let notSure: any = 4;  
5. void, null 和 Undefined, never
6. 类型断言 <string>someValue, someValue as string  
7. let  

# Practical Angular

1. CTRL+SHIFT+B => compile ts  
2. typehtml:5 and press tab => generate code [integration between Visual Studio Code andemmet]()  
3. live-server  
4. watch:true => compile automatically  
5. Terminate running task
6. Debug



## Content Q
1. 具有副作用的导入模块  
2. 大家最熟知的JavaScript模块加载器是服务于Node.js的CommonJS和服务于Web应用的Require.js  
3. export = 和 import = require() 为何如此使用，使用场景？

## Technology Q
1. CommonJS  
2. AMD  
3. [联合类型](https://zhongsp.gitbooks.io/typescript-handbook/content/doc/handbook/Basic%20Types.html)  
4. strictNullChecks标记  
5. 

## tsconfig.json
### https://www.typescriptlang.org/docs/handbook/compiler-options.html
### https://www.typescriptlang.org/docs/handbook/tsconfig-json.html#types-typeroots-and-types
**@types, typeRoots and types**  
默认情况下，在编译中，所有可见的"@type"包都被引入了。在任何封闭文件夹 node_modules/@types中的包都被认为是可见的。
特别是在./node_modules/@types/，../node_modules/@types/，../../node_modules/@types/等中的包。

如果typeRoots被指定了的话，只有位于typeRoots下的包会被引入。比如：
```
{
   "compilerOptions": {
       "typeRoots" : ["./typings"]
   }
}
```
这个配置文件将会引入./typings下的所有包，不会引入./node_modules/@types下的包。

如果types被指定了，只有列出来的包会被引入。比如：
```
{
   "compilerOptions": {
       "types" : ["node", "lodash", "express"]
   }
}
```
这个tsconfig.json文件只会引入./node_modules/@types/node, ./node_modules/@types/lodash and ./node_modules/@types/express。
在node_modules/@types/*中的其他包将不会被引入。

指定"types": []来使@types包的自动引入失效。

注意只有你正在使用全局声明的文件时，自动引入才重要（相对的就是定义为模块的文件）。比如，如果你使用import "foo"语句，
TypeScript可能依然会查看node_modules和node_modules/@types文件夹来查找foo包。

**使用extends进行配置继承**  
一个tsconfig.json文件可以用extends属性继承来自另一个文件的配置。
extends是tsconfig.json的顶层属性（top-level property），和compilerOptions, files, include, exclude并肩。
extends的值是一个包含要继承的另一个配置文件路径的字符串。

来自于基本文件的配置会被首先加载，然后会被[继承配置文件]的配置覆盖。如果遇到一个环路，就会报告一个错误。
来自继承配置文件的files, include 和 exclude会覆写来自基本文件的它们。

所有在配置文件中的相对路径会被解析为相对于它们所在的这个配置文件。

比如：
configs/base.json:
```
{
  "compilerOptions": {
    "noImplicitAny": true,
    "strictNullChecks": true
  }
}
```

tsconfig.json:
```
{
  "extends": "./configs/base",
  "files": [
    "main.ts",
    "supplemental.ts"
  ]
}
```
tsconfig.nostrictnull.json:
```
{
  "extends": "./tsconfig",
  "compilerOptions": {
    "strictNullChecks": false
  }
}
```
 
