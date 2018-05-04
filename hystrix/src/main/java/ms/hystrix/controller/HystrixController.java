package ms.hystrix.controller;

import ms.hystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunjx on 2018/5/4.
 */
@Controller
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @RequestMapping
    @ResponseBody
    public String index(){
        return hystrixService.serviceName();
    }
}
