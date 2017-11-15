#### 自定义spring-boot-starter
仿照 org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration，手写一个
spring-boot-starter pom,实现自动配置，使得通用配置的耦合度更低

本例：当HelloService.class存在时，自动配置这个类的bean，并可将bean的属性在application.properties中配置
