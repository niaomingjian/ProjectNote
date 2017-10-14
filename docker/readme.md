## Links ##
1. [Get started with Docker](https://docs.docker.com/get-started/)  
2. [Docker CLI Reference](https://docs.docker.com/engine/reference/commandline/cli/)  
3. [Docker-compose CLI Reference](https://docs.docker.com/compose/reference/overview/)

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

## Google Cloud Platform
+ Install docker:
```
sudo yum install docker
```

https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-compose-on-centos-7
