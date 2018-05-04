package ms.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunjx on 2018/5/4.
 */
@Controller
public class ConfigClientController {

    @Value("${author.first-name}")
    private String firstName;

    @Value("${author.second-name}")
    private String secondName;

    @RequestMapping
    @ResponseBody
    public String index(){
        return "firstName: " + firstName + ", secondName: " + secondName;
    }
}
