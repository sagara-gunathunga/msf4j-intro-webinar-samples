# MSF4J Intro Webinar Samples  : Helloworld-Metrics 

This sample demonstrates how to use Metrics annotations with  WSO2 MSF4J Maven Archetype 


```java 
@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/{user}")
    @Metered | @Timed | @Counted 
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
java -jar target/HelloWorld-Metrics-1.0.0-SNAPSHOT.jar
```

# How to build and run using Gradle 

1. Run following command 
```shell
gradle 
```
 
2. Run the application using following java commend 

```shell
java -jar build/libs/HelloWorld-Metrics-all.jar 
```

# How to test this sample 
Use following cURL command
```shell
shell curl -v http://localhost:8080/hello/world 
```










