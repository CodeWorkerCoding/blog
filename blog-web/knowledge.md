## 项目知识点
***
### spring boot项目直接启动web项目
- pom 文件必须添加一下依赖
```xml
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
    </dependencies>
```

### spring boot web项目静态资源访问
    
- 项目目录配置

    在项目中中webapp文件夹下创建static文件夹， 将静态资源直接放入此目录中
- 页面静态资源的应用

    使用相对路径直接访问。
    ```jsp
    <link rel="stylesheet" href="static/assets/css/app.css"/>
```
