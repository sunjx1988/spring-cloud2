1.http://localhost:8091/feign 经过路由等同于 http://localhost:8086 直接访问feign   
2.http://localhost:8091/eureka-client/get_service_name 经过路由等同于 http://localhost:8082/get_service_name 直接访问eureka-client     
3.zuul:
    routes:
      eureka-client: /ec/**
      feign: /fn/**
    将/ec/**转发到 spring.application.name = eureka-client 的服务
    将/fn/**转发到 spring.application.name = feign 的服务