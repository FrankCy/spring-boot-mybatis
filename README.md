# Spring boot mybatis #
### mybatis demo ###
- 简介 <br/>
此工程使用Spring Boot 2.0 搭建，主要练习Mybatis CRUD

- 环境／版本

组件|版本|描述
---|:--:|---:
Spring Boot|2.0+|技术主键
JDK|1.8+|JAVA
Maven|3.3.9|构建工具
alibaba Druid |1.1.9|数据库连接池


- SQL语句
```
CREATE TABLE t_user(
  user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  phone VARCHAR(255) NOT NULL
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;
```

- 接口描述
  + 创建：htt://localhost:8091/add
  + 查询：htt://localhost:8091/all

