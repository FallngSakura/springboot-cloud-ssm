package club.fallngsakura.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer8001Application.class, args);
    }

}
