package club.fallngsakura.cloud.serivce;


import club.fallngsakura.cloud.entities.CommonResult;
import club.fallngsakura.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * PaymentService
 *
 * @author MISAKI RINNE
 * @version 1.0
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 获取订单
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * 测试超时
     * @return
     */
    @GetMapping("/payment/feign/timeout")
    public Integer feignTimeOut();
}
