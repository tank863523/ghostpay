# GhostPay支付

#### 介绍
一个GhostPay支付系统

#### 软件架构
Spring Cloud、Spring Cloud Alibaba、MyBatis Plus、MySQL Connector、Knife4j、JWT、HttpClient、Fastjson
Nacos
#### 项目结构：
common: 基础公共模块，包含一些通用的工具类、配置等。  
model: 数据模型模块，定义了与业务相关的实体类、DTO（Data Transfer Object）等。  
service: 服务层模块，实现了业务逻辑处理，包括对数据模型的增删改查等操作。  
    service-login:   
    service-xxx:  
    service-xxx:  
    service-xxx:  

#### 使用说明：

1.  数据库gpaydb
2.  基础工具类

![image](https://github.com/tank863523/ghostpay/assets/51073954/e9b65511-4602-45ec-900b-e9326967b87f)

model位置
![image](https://github.com/tank863523/ghostpay/assets/51073954/c75c920c-7b25-476c-bdaf-88e52417a77f)

启动前配置自己的nacos端口：8848，修改配置application-dev.yml





