# spring-cloud2

名称 | 端口 | 作用
---|---|---
eureka-server | 8081 | 服务注册中心
eureka-client | 8082 | 服务提供者
consul | 8083/8084 | 服务提供者/服务发现
eureka-consumer | 8085 | 服务消费者
feign | 8086 | 声明式服务消费者
feign-upload-server | 8087 | feign文件上传服务
feign-upload-consumer | 8088 | feign文件上传服务消费者
config-server   | 8089 | 基于Git配置服务
config-client   | 8090 | 基于Git配置服务的客户端
zuul   | 8091 | zuul路由网关
zipkin | 8092 | 服务调用链路追踪
