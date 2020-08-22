
## spring boot 2 mybatis 多数据源配置</br>
````SQL
配置不同的DataSource、不同的SessionFactory、不同的SessionTemplate、不同的MapperScan，实现多数据源操作

CREATE DATABASE IF NOT EXISTS demo_05;
create user 'user_dev'@'localhost' identified by 'pass_dev';
grant all privileges on demo_05.* to 'user_dev'@'localhost';

````

