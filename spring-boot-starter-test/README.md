### 测试 spring-boot-starter-hello 的自动配置

开启
```
debug=true
```

控制台
```
HelloServiceAutoConfiguration matched:
      - @ConditionalOnClass found required class 'com.crw.springbootstarter.HelloService'; @ConditionalOnMissingClass did not find unwanted class (OnClassCondition)
      - @ConditionalOnProperty (hello.enabled) matched (OnPropertyCondition)
```

输入：http://localhost:8080/hello
输出：
```
my auto configure info
```