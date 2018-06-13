package ms.zipkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @Auther: sunjx
 * @Date: 2018/06/13 16:36
 * @Description:
 */
@Slf4j
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServer {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServer.class, args);
    }
}
