package com.crw.springbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 * <p>
 * 根据 HelloServiceProperties 提供的参数，并通过 @ConditionalOnClass 判断 HelloService.class是否
 * 在类路径下存在，且当容器中没有这个 Bean 的情况下自动创建这个 Bean
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(
        prefix = "hello",
        name = {"enabled"},
        matchIfMissing = true
)
public class HelloServiceAutoConfiguration {
    private final HelloServiceProperties helloServiceProperties;

    public HelloServiceAutoConfiguration(HelloServiceProperties helloServiceProperties) {
        this.helloServiceProperties = helloServiceProperties;
    }

    @Bean(
            name = {"helloService"}
    )
    @ConditionalOnMissingBean({HelloService.class})
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
