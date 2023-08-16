https://start.spring.io/

For setting up your MAVEN in the code

### POM file
- where you can find all the dependencies and information needed for your code

### Build Project Automatically
- Preferences > Build, Execution, Deployment > Compiler
- Check the box: **Build project automatically**
- Preferences > Advanced Settings 
- Check the box: **Allow auto-make to start**
- Add the codeblock in dependencies: 
    ```
  <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-devtools</artifactId>
    <dependency>
  ```
- then be sure to reload maven changes

### Spring Boot Actuator 
- Automatically exposes endpoints for metrics out-of-the-box 
- Allows you to see the health of your application
- You can only access `\health` on the url but if you want to include info: 
`management.endpoints.web.exposure.include=health,info` and by also setting the `env.enabled` to true.
- To add info you can update `application.properties`
- Add the codeblock in dependencies:
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
<dependency>
```

### Creating a REST Controller 
- use `@RestController`