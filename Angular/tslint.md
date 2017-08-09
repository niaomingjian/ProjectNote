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

+ Implement lifecycle hook interface OnInit for method ngOnInit in class ContractDetailPageComponent
```
export class PageComponent {
  ngOnInit() {
  }
}
=>
export class PageComponent implements OnInit {
  ngOnInit() {
  }
}
```

+ Shadowed variable: 'categoryId'
```
const categoryId = '4';
export class ProductGuideComponent {
    goto() {
    const categoryId = '';
    window.open('../estimate?categoryId=' + categoryId, '_blank');
  }
}
=>
const categoryId = '4';
export class ProductGuideComponent {
    goto() {
    const categoryIdFromProperty = '';
    window.open('../estimate?categoryId=' + categoryIdFromProperty, '_blank');
  }
}
```


