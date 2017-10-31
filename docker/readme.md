## Links ##
1. [Get started with Docker](https://docs.docker.com/get-started/)  
2. [Docker CLI Reference](https://docs.docker.com/engine/reference/commandline/cli/)  
3. [Docker-compose CLI Reference](https://docs.docker.com/compose/reference/overview/)
4. [Dockerfile reference](https://docs.docker.com/engine/reference/builder/)
5. [Compose file version 3 reference](https://docs.docker.com/compose/compose-file/)
6. [Docker 加速器](http://guide.daocloud.io/dcs/daocloud-9153151.html)

## Notes ##
1. Create a new Bash session in the container ubuntu_bash  
`docker exec -it ubuntu_bash bash`  
`docker exec --interactive --tty ubuntu_bash bash`

2. docker run -it --link dev-cassandra --rm --network docker_default cassandra sh -c "exec cqlsh dev-cassandra"  
`--link => Add link to another container`  
`--rm => Automatically remove the container when it exits`  
`--network => Connect a container to a network`  

3. docker-compose exec dev-cassandra cqlsh  
This is equivalent of `docker exec`. By default `docker-compose exec` allocates a TTY.

### 镜像的导入导出
1. docker images 列出所有的镜像  
2. docker save -o \<images.tar\> \<repository\> 将repository镜像保存到images.tar  
3. docker load -i <images.tar> 将镜像导入  
(或者  
   docker save \<image id\> \> \<images.tar\>  
   docker load \< \<images.tar\>  
   不过导入后的镜像似乎没有了repository和tag，可以用 docker tag \<image id\> \<repository\>:\<tag\> 重新命名  
)  

### 改变Docker VM的位置
+ [Change Docker machine location - Windows](https://stackoverflow.com/q/33933107/4983501)

### 关闭Docker VM
+ [docker-machine stop](https://docs.docker.com/machine/reference/stop/)
```
docker-machine stop <VM name>
```

### Docker commands
+ 检索镜像  
docker search <redis>  
  
+ 下载镜像  
docker pull <redis>  
  
+ 列出本地镜像  
docker images  
  
+ 删除镜像  
docker rmi image-id  
  
+ 删除所有镜像  
docker rmi $(docker images -q)  
  
+ 列出运行中的容器  
docker ps  
  
+ 列出运行和停止的容器  
docker ps -a  
  
+ 运行镜像为容器  
docker run --name container-name -d image-name  
-d => detached 控制台不会阻塞  
  
+ 停止容器  
docker stop container-name/container-id  
  
+ 启动容器  
docker start container-name/container-id  
  
+ docker容器中端口映射到主机的端口  
-p 参数  
  
+ docker容器的端口 => VirtualBox的端口 => Windows主机端口  
  
+ 查看当前容器日志  
docker logs container-name/container-id  
  
+ 登录容器  
[winpty] docker exec -it container-id/container-name bash  
  
+ 登录虚拟机  
docker-machine ssh  
or boot2docker ssh(本机测试不行)  
  
+ 启动docker并保持开机自启  
systemctl start docker  
systemctl enable docker  


## Google Cloud Platform
+ Install docker:
```
sudo yum install docker
```

https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-compose-on-centos-7



