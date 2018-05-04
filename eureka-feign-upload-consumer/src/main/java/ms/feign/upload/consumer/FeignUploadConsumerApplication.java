package ms.feign.upload.consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoConfiguration
public class FeignUploadConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignUploadConsumerApplication.class).web(true).run(args);
    }
}
