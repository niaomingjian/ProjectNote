## Links ##
1. [Get started with Docker](https://docs.docker.com/get-started/)  
2. [Docker CLI Reference](https://docs.docker.com/engine/reference/commandline/cli/)  
3. [Docker-compose CLI Reference](https://docs.docker.com/compose/reference/overview/)

## Notes ##
1. Create a new Bash session in the container ubuntu_bash  
`docker exec -it ubuntu_bash bash`  
`docker exec --interactive --tty ubuntu_bash bash`

2. docker run -it --link dev-cassandra --rm --network docker_default cassandra sh -c "exec cqlsh dev-cassandra"  
    <pre>--link    Add link to another container</pre>
    <pre>--rm    Automatically remove the container when it exits</pre>
    <pre>--network    Connect a container to a network</pre>
