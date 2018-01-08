# spring-cloud-zuul
A simple zuul implementation using spring cloud.

Zuul is a JVM based router and server side load balancer by Netflix.
Spring Cloud has created an embedded Zuul proxy to ease the development of a very common use case where a UI application wants to proxy calls to one or more back end services. 

### prerequisites
1. Java 1.8
2. Maven 3.5.2
3. Tomcat 7
4. Postgresql 42.1.4
5. Spring Tool Suite IDE

### setup
1. Clone this project
2. Open ZuulEurekaServer, ZuulGateway, ZuulTestServiceOne and ZuulTestServiceTwo as separate maven projects.
3. Update maven dependencies in all.
4. Take separate jar builds of all projects and run them on server.
5. Hit `http://localhost:8761` for the Eureka server portal.
6. Check the running instances for the `ZUULGATEWAY`, `ZUULTESTSERVICEONE`, `ZUULTESTSERVICETWO` and click on it to view the info.
7. After making sure that the above step works fine, try hitting the below URLs to get the info of `ZUULTESTSERVICEONE` and `ZUULTESTSERVICETWO` via ZuulGatway

	`http://localhost:8765/zuulTestServiceOne/info` and `http://localhost:8765/zuulTestServiceTwo/info`

### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import into eclipse -> window -> preferences -> java -> code style -> formatter