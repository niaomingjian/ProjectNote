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
+ 列出文件夹中的所有文件名  
`for %a in (*) do @echo %~a`

# [ss64.com References](https://ss64.com/nt/syntax-args.html)
+ [Command Line arguments (Parameters)](https://ss64.com/nt/syntax-args.html)
+ [ECHO](https://ss64.com/nt/echo.html)
+ [SET](https://ss64.com/nt/set.html)  
  + SET variable=string 等号左侧有空格的话，会作为变量名的结尾字符。等号右侧有空格的话，会作为其值的开始字符  
+ [IF](https://ss64.com/nt/if.html)
+ [SETLOCAL](https://ss64.com/nt/setlocal.html)
+ [ariables: extract part of a variable (substring)](https://ss64.com/nt/syntax-substring.html)
+ [Variable Edit/Replace](https://ss64.com/nt/syntax-replace.html)

# Notes
+ %\* 表示所有参数
+ %~dp0 表示脚本所在的目录的完整路径
+ cmd /V /E /C   
  /V:ON => Enable delayed environment variable expansion  
  /E:ON => Enable CMD Command Extensions (default)  
  /C  => Run Command and then terminate  
+ PUTTY ssh连接  
  `putty.exe -ssh -l <username> -i <privatekeyfile> <host>`  
  `putty.exe -ssh <username>@<host> -i <privatekeyfile>`  
  e.g. `putty.exe -ssh niaomingjian@35.200.100.50 -i nmj.ppk`  
+ [命令行设置持久性的环境变量](http://www.dowdandassociates.com/blog/content/howto-set-an-environment-variable-in-windows-command-line-and-registry/) setx.exe  
  e.g. `setx EC2_CERT "%USERPROFILE%\aws\cert.pem"`  
+ 显示目录树结构  
  `tree`
