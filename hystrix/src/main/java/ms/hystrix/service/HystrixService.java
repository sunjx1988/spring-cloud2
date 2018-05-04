package ms.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import ms.hystrix.service.consumer.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sunjx on 2018/5/4.
 */
@Service
public class HystrixService {

    @Autowired
    private EurekaClient eurekaClient;

    @HystrixCommand(fallbackMethod = "fallback")
    public String serviceName(){
        return eurekaClient.serviceName();
    }

    public String fallback(){
        return "fallback";
    }
}
