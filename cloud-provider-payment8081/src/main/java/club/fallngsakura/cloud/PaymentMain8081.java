package club.fallngsakura.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author MISAKI RINNE
 * @version 1.0
 * @NAME: PaymentMain8081
 * @date 2020/5/12 16:23
 */
@SpringBootApplication
@MapperScan(basePackages = "club.fallngsakura.cloud.dao")
@EnableEurekaClient
public class PaymentMain8081
{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8081.class,args);
    }
}
