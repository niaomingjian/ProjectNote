# Useful scripts
+ Rename multiple files in a directory  
`for %a in (*.xlsx) do ren "%~a" "%~na version 1%~xa"`
Running this in a directory in the command line
```
    D:\temp>for %a in (*.xlsx) do ren "%~a" "%~na version 1%~xa"
    D:\temp>ren "10.xlsx" "10 version 1.xlsx"
    D:\temp>ren "11.xlsx" "11 version 1.xlsx"
    D:\temp>ren "12.xlsx" "12 version 1.xlsx"
```

# [ss64.com References](https://ss64.com/nt/syntax-args.html)
