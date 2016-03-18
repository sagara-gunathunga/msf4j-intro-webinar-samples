
# MSF4J Samples  : Student Managemant  

This is a  basic sample created using WSO2 MSF4J Maven Archetype 


# How to build and run using Maven 

1. Run following command 

```shell
mvn clean package 
```
 
2. Run the application using following java commend 

```shell
java -jar target/studentmgt-1.0.0.jar
```


# How to test this sample 
Use following cURL commands

1. Add student 
```shell
curl -i -H "Accept: application/json" -H "Content-Type: application/json"  --data "{id='400', name='sam'}" -X POST http://localhost:8080/students

```

2. get specific student 
```shell
curl -i  http://localhost:8080/students/400

```


3. get all students 
```shell
curl -i -H "Accept: application/json" -H "Content-Type: application/json"  --data "{id='400', name='sam'}" -X PUT http://localhost:8080/students/400
```

3. Modify  students details  
```shell
curl -i  http://localhost:8080/students

```

5. Remove a students 
```shell
curl -i -X DELETE http://localhost:8080/students/400

```
