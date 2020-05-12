package club.fallngsakura.cloud.dao;

import club.fallngsakura.cloud.entities.Payment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * @author MISAKI RINNE
 * @version 1.0
 * @NAME: PaymentDao
 * @date 2020/5/12 16:24
 */
@Mapper
public interface PaymentDao
{

    /**
     * 新增Payment
     * @param payment
     * @return
     */
    @Insert("insert into payment(serial) values(#{serial})")
    public int create(Payment payment);

    /**
     * 根据Id获取Payment
     * @param id
     * @return
     */
    @Select(" select * from payment where id = #{id}")
    public Payment getPaymentById(@Param("id")Long id);
}
