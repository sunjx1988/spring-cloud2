package ms.feign.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eureka-client")
public interface EurekaClient {

    @RequestMapping(value = "get_service_name", method = RequestMethod.GET)
    String serviceName();
}
