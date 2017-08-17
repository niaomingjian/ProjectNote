# [Angular](https://angular.cn/docs/ts/latest/)

## Angular CLI

+ $ ng version  
result: 
```
    _                      _                 ____ _     ___
   / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
  / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
 / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
/_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
               |___/
@angular/cli: 1.2.1
node: 6.9.4
os: win32 x64
@angular/animations: 4.2.6
@angular/common: 4.2.6
@angular/compiler: 4.2.6
@angular/core: 4.2.6
@angular/forms: 4.2.6
@angular/http: 4.2.6
@angular/platform-browser: 4.2.6
@angular/platform-browser-dynamic: 4.2.6
@angular/router: 4.2.6
@angular/cli: 1.2.1
@angular/compiler-cli: 4.2.6
@angular/language-service: 4.2.6
```

+ [angular-cli proxy for multiple backends](https://stackoverflow.com/q/43364804/4983501)  
refs :  
https://github.com/angular/angular-cli/wiki/stories-proxy  
https://webpack.github.io/docs/webpack-dev-server.html#proxy  
https://github.com/chimurai/http-proxy-middleware#options  



### [Angular CLI Config Schema](https://github.com/angular/angular-cli/wiki/angular-cli#angular-cli-config-schema)

### [ultimate-angular-cli-reference](https://www.sitepoint.com/ultimate-angular-cli-reference/)  

## Note
1. When running `ng serve`, the compiled output is served from memory, not from disk. This means that the application being served is not located on disk in the `dist` folder.  

a development server  
tests  
build  
deployment  

npm ls -g --depth=0  
npm install -g @angular/cli  

ng version  

ng init: create a new application in the current directory  
ng new: create a new directory and run ng init inside the new directory  

npm uninstall -g @angular/cli angular-cli  
npm cache clean  
npm install -g @angular/cli@latest  

## Angular
Angular’s component driven development  


## Links
https://blog.thoughtram.io/angular/2016/05/23/opaque-tokens-in-angular-2.html#injectiontoken-since-angular-4x

### angular 2 login app
+ [Angular 2/4 User Registration and Login Example & Tutorial](http://jasonwatmore.com/post/2016/09/29/angular-2-user-registration-and-login-example-tutorial)
+ [Angular 2/4 JWT Authentication Example & Tutorial](http://jasonwatmore.com/post/2016/08/16/angular-2-jwt-authentication-example-tutorial)
+ [Angular 2 Authentication Tutorial](https://auth0.com/blog/angular-2-authentication/)
+ [Login Screen and Authentication with Angular2](http://4dev.tech/2016/03/login-screen-and-authentication-with-angular2/)

### ExpressionChangedAfterItHasBeenCheckedError
+ https://stackoverflow.com/q/44655745/4983501
+ https://blog.angularindepth.com/everything-you-need-to-know-about-the-expressionchangedafterithasbeencheckederror-error-e3fd9ce7dbb4






