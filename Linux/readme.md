## Links ##
1. [Unix and Linux Commands Help](https://www.computerhope.com/unix.htm)
2. [鸟哥的 Linux 私房菜](http://cn.linux.vbird.org/linux_basic/linux_basic.php)
   + [YUM 线上升级机制](http://cn.linux.vbird.org/linux_basic/0520rpm_and_srpm.php#yumclient)

## [ss64.com References](https://ss64.com/bash/)
+ [Redirection and Process Substitution](https://ss64.com/bash/syntax-redirection.html)  
  such as `command &`

## Notes ##
1. [sh](https://www.computerhope.com/unix/ush.htm) -c "XXX"  
`-c string` =>	If the -c flag is present then commands are read from string.

2. display environment variables  
`env` or `set` (CentOS)  
`echo $PATH`  
`export variable=value`  

3. 查询文件位置  
`whereis hazelcast.xml`  

4. PATH中追加路径  
export PATH=$PATH:~/opt/bin  

5. Extract the last 85 lines from a file:  
$ tail -85 file,txt  

6. Count the number of lines in file1.txt  
$ wc -l < file1.txt  

7. Extract lines 40-50 from a file, first using head to get the first 50 lines then tail to get the last 10:  
$ head -50 file.txt | tail -10  

8. 更改文件或目录的拥有者  
`sudo chown -R cassandra:cassandra .`

9. [top command 按Memory排序](https://unix.stackexchange.com/a/128957/208518)  
Shift + M  
Shift + F -> ↑ or ↓　-> S  

10. 环境变量  
`sudo vi ~/.bash_profile`  
e.g. `export PATH=/opt/apache-maven-3.3.9/bin:$PATH`  

11. [查看目录的总容量](http://cn.linux.vbird.org/linux_basic/0230filesystem_2.php)  
`du -sh`

12. 查看磁盘的使用情况  
`df -h`

13. [查看环境变量定义在哪个文件中](https://unix.stackexchange.com/q/813/208518)  
`sudo grep -r VARIABLE /etc/*`  
`sudo grep -r VARIABLE ~/.*`

14. [修改系统时区](https://www.cyberciti.biz/faq/centos-linux-6-7-changing-timezone-command-line/)  
`sudo timedatectl set-timezone Asia/Shanghai`

15. [语系(Locale)](http://cn.linux.vbird.org/linux_basic/0320bash.php#variable_locale)  
`locale -a`  
`LANG=zh_CN.UTF-8`  
`echo $LANG`  

16. [如何调整Linux系统为正确时区](https://www.sysgeek.cn/change-timezone-linux/)  
`tzselect` - 找到需要的时区  
`export TZ='Asia/Shanghai'`  
`source ~/.bashrc`  
或  
`sudo rm -f /etc/localtime`  
`sudo ln -s /usr/share/zoneinfo/Asia/Shanghai /etc/localtime`  
或  
`sudo timedatectl set-timezone 'Asia/Shanghai'`  

### pssh
+ [pssh(1) - Linux man page](https://linux.die.net/man/1/pssh)

