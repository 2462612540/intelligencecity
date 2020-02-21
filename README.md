# intelligencecity
这本人在**科技大学无锡研究院参与设计的无锡市惠山区的智慧城市系统的项目。
本项目涉及大型分布式系统架构，Springboot Springcloud Springmvc  dubbo Zoookeeper 机器学习，数据分析，深度学习系统的使用，以及微服务的构建 
*************************************************************************************************
                                    系统配置端口和环境
*************************************************************************************************
本地测试数据库的基本的配置
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://localhost:3306/intelligencecity?characterEncoding=utf-8
jdbc.username=root
jdbc.password=root
*************************************************************************************************
系统中的的zookeeper的注册端口是2181
*************************************************************************************************
duubbo的提供服务的消费和产生的端口是
    intelligencecity_manager_service/intelligencecity_manager_web：20881
    intelligencecity_user_service/intelligencecity_usr_web       : 20882
*************************************************************************************************
在服务的提供方中都采用的8081-808*开始
在本系统中的manager_service中的端口是8101 
*************************************************************************************************         
在服务是消费方中都采用的9091-909*开始
在本系统中的manager_controller中的端口是9101 
************************************************************************************************* 
搭建spring框架得时候要考虑jdk的版本，提供一下参考
JDK 8 中可以使用 Spring Framework 5.x
JDK 7 中可以使用 Spring Framework 4.x
*************************************************************************************************