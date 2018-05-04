package ms.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by sunjx on 2018/5/4.
 */
@EnableFeignClients
@SpringCloudApplication
public class HystrixServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixServerApplication.class, args);
    }
}
