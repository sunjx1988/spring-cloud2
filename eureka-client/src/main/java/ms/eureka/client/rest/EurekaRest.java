package ms.eureka.client.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class EurekaRest {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "get_service_name", method = RequestMethod.GET)
    public String serviceName(){
        log.info("call get_service_name");
        return "Service: " + discoveryClient.getServices();
    }
}
