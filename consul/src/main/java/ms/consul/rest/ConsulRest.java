package ms.consul.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulRest {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping
    public String serviceName(){
        return "Service Name: " + discoveryClient.getServices();
    }
}
