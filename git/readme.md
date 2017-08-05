Git

[Git-Credential-Manager-for-Windows](https://github.com/Microsoft/Git-Credential-Manager-for-Windows)  

secure Git credential storage 安全的Git凭据存储  

Git Credential Manage for Windows(GCM)  
Windows Credential Store for Git(git-credential-winstore) => 不再维护了  
credential storage for Windows(wincred) => Git内置的凭据存储  

wincred => 为任何使用HTTP（HTTP enabled）的Git库提供了单因素认证的支持  
GCM => 为Visual Studio Team Services, Team Foundation Server, GitHub, BitBucket提供了多因素的认证支持  

包含：  
+ 在Windows Credential Store中的安全密码存储
+ 为Visual Studio Team Services提供多因素认证支持  
+ 为GitHub提供双因素认证支持  
+ 为Bitbucket提供双因素认证支持  
+ 为Visual Studio Team Services, GitHub提供个人访问令牌（Personal Access Token）生成和使用的支持  
+ 。。。。。。

[Git Credential Managers是如何工作的？ How the Git Credential Managers works](https://github.com/Microsoft/Git-Credential-Manager-for-Windows/wiki/How-the-Git-Credential-Managers-works)  

GCM是一个凭证帮助工具。它将你的凭证安全地存储在Windows凭证管理中（Windows Credential Manager），因为你只需要为你访问的远程库输入一次凭证。  
所有的Git命令都会再使用已经存在的凭证。

使用GCM做Git HTTPS认证  

+ git需要和远程宿主通过HTTPS协议一起工作，会调用git-remote-https  
+ git-remote-https和宿主协商  
+ 由于缺少凭证，宿主会拒绝git-remote-https  
+ git-remote-https失败，会有一个和凭证相关的原因代码  
+ git调用git-credential，希望得到有用的凭证  
+ git-credential扫描Git的配置看是否有帮助工具被注册了  
+ git-credential会一个个调用这些帮助工具[in the order listed in hopes of one having useful credentials for the + values]  
+ git-credential找到credential.helper=manager并用get选项调用git-credential-manager  
+ git-credential-manager缺少远程宿主的凭证  
+ git-credential-manager查看配置是否是基础凭证，Visual Studio Team Services，GitHub，是否是多因素认证等等  
+ 是基础凭证的话，git-credential-manager告诉git-credential它没有任何凭证  
+ git-credential就在命令行中提示用户需要凭证  
+ 用户输入凭证
+ git-credential用store选项调用git-credential-manager，并存储凭证。



