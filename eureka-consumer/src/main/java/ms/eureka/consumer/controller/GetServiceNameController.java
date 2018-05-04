package ms.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class GetServiceNameController {

    @Value("${rmi.app.name}")
    public String serviceApplicationName;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "rmi_get_service_name")
    @ResponseBody
    public String getServiceName(){
        ServiceInstance serviceInstance = loadBalancerClient.choose(serviceApplicationName);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/get_service_name";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
