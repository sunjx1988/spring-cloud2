package ms.feign.upload.consumer.controller;

import ms.feign.upload.consumer.client.FeignUploadClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FeignUploadConsumerController {

    @Autowired
    private FeignUploadClient feignUploadClient;

    @RequestMapping("")
    public String index(){
        return "/index.html";
    }

    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Object upload(@RequestPart(value = "file") MultipartFile file){
        return feignUploadClient.handleFileUpload(file);
    }
}
