package ms.hystrix.service.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sunjx on 2018/5/4.
 */
@Component
@FeignClient("eureka-client")
public interface EurekaClient {

    @RequestMapping(value = "get_service_name", method = RequestMethod.GET)
    String serviceName();


}
