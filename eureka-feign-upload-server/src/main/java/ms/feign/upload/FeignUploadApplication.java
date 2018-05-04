package ms.feign.upload;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignUploadApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignUploadApplication.class).web(true).run(args);
    }
}
