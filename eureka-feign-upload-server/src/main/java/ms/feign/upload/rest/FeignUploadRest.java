package ms.feign.upload.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FeignUploadRest {

    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(@RequestPart(value = "file") MultipartFile file){
        //TODO 简化处理,不做真实保存
        return "Name: " + file.getName()
                + ",ContentType: " + file.getContentType()
                + ",OriginalFilename " + file.getOriginalFilename()
                + ",Size: " + file.getSize();
    }
}
