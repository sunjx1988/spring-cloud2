package ms.feign.controller;

import ms.feign.api.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {

    @Autowired
    private EurekaClient eurekaClient;

    @RequestMapping
    @ResponseBody
    public String getEurekaServiceName(){
        return eurekaClient.serviceName();
    }
}
