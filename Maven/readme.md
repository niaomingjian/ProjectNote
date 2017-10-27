+ install a jar to local repository   
`mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.2.0 -Dpackaging=jar -Dfile=e:\ojdbc6.jar`

+ maven打包时跳过测试  
`mvn install -Dmaven.test.skip=true`  
`mvn install -DskipTests`  
