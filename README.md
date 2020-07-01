### 摘要记录

这是一个springboot项目
主要存放自己写的一些代码片段记录和一些代码示例
项目下载地址:`https://github.com/a879153503/myfirstspringboot.git`

以后会做成
springboot+vue的前后端分离模式

#### 列举本项目以后涉及的一些技术栈

1. rabbitmq
2. redis
3. Spring Security
等等等。。。。


### 2020/06/30
1. 本次上传了获取根据指定参数获取token，存到redis 设置有效期两小时等。。。
2. 自定义了接口拦截器 在>>>>>>WebMvcConfiguration
3. 自定义了一个注解@NotRepeatSubmit
4. 上传了几个工具类在util包下
5. 引入了Assert：断言机制
测试代码或者调试程序时，总会做出一些假设，断言就是用于在代码中捕捉这些假设。当要判断一个方法传入的参数时，我们就可以使用断言。


### 2020/07/01
1. 上传了jdbcTemplate的增删改查和jdbcTemplate的多数据源配置
2. 上传了mybatis整合springboot的配置并在测试类里测试了查询
3. 在配置mybatis时如果想要把mapper.xml文件放到接口对应目录下
需要在pom文件里加入如下配置:
<resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>

            <resource>
                <directory>src/main/resources</directory>
            </resource>
        </resources>

第一个resource表示在路径下所有.xml文件打包时别给忽略了
第二个表示把原有的resources静态文件夹加上 如果不加原有的会把原有的直接忽略不打包