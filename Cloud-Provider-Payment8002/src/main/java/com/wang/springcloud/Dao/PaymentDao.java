package com.wang.springcloud.Dao;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author wangsiyuan
 */
@Mapper
@Repository
public interface PaymentDao {

    public int create(Payment payment);

    Payment getPaymentId(@Param("id") long id);

}
