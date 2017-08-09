+ Type string trivially inferred from a string literal, remove type annotation
```
public estimateId: string = ''; 
=> 
public estimateId = '';
```

+ comment must start with a space
```
isCompany = true; // isCompany
=>
// isCompany
isCompany = true; 
```
+ Declaration of instance field not allowed after declaration of instance method. Instead, this should come at the beginning of the class/interface.

+ Exceeds maximum line length of 140

+ This import is blacklisted, import a submodule instead  
```
import { Observable } from 'rxjs';
=>
import { Observable } from 'rxjs/Observable';
```

