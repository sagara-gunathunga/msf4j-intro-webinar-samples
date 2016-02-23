# MSF4J Intro Webinar Samples  : Helloworld-Security 

This sample demonstrates how to write and use Interceptor with MSF4J framework also demonstrates BasicAuth security.     



# How to build and run using Maven 

1. Run following command 

```shell
mvn clean package 
```
 
2. Run the application using following java commend 

```shell
java -jar target/HelloWorld-Security-1.0.0-SNAPSHOT.jar
```

# How to build and run using Gradle 

1. Run following command 
```shell
gradle 
```
 
2. Run the application using following java commend 

```shell
java -jar build/libs/HelloWorld-Security-all.jar
```

# How to test this sample 
Following cURL command will return HTTP 401 status code 
```shell
shell curl -v http://localhost:8080/hello/world 
```

Following cURL command will return HTTP 200 status code with expected results 
```shell
shell curl -u sagara:sagara -v http://localhost:8080/hello/world 
```
