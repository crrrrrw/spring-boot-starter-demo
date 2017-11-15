package com.crw.springbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性配置（在application.properties中设置hello.msg=即可，默认hello.msg=hello）
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String DEFAULT_MSG = "hello";

    private String msg = DEFAULT_MSG;

    public HelloServiceProperties() {
    }

    public HelloServiceProperties(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
