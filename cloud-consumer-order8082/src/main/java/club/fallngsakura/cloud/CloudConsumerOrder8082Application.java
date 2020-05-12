package club.fallngsakura.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CloudConsumerOrder8082Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder8082Application.class, args);
    }

}
