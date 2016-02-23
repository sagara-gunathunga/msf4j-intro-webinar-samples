# MSF4J Intro Webinar Samples  : Helloworld 

This is a very basic HelloWorld sample created using WSO2 MSF4J Maven Archetype 


```java 
@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/{user}")
    public String hello(@PathParam("user") String user) {
        return "Hello " + user;
    }

}
```

# How to build and run using Maven 

1. Run following command 

```shell
mvn clean package 
```
 
2. Run the application using following java commend 

```shell
java -jar target/HelloWorld-1.0.0-SNAPSHOT.jar
```

# How to build and run using Gradle 

1. Run following command 
```shell
gradle 
```
 
2. Run the application using following java commend 

```shell
java -jar build/libs/HelloWorld-all.jar 
```

# How to test this sample 
Use following cURL command
```shell
shell curl -v http://localhost:8080/hello/world 
```









