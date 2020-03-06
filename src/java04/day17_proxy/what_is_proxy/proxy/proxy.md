#一、 简单的代理模式

##举例：ProxyDemo.java

##proxy pattern的实现条件

### 1.有目标对象（服务接口）

比如出售商品，提供其它的服务等


###2.有代理对象 

说白了就是中介，即为目标对象提供渠道

##优势：

避免了目标对象的一系列麻烦

实现了代理对象的专业功能，提升效率


##缺点：

1.代理对象不够强大，当需要代理其它服务时需要不断地去实现其它服务接口，扩展性差

2.维护性极差


# 二、动态代理模式

##举例：JDK_Dynamic_ProxyDemo.java
