package com.wang.springcloud.service;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface IPaymentService {

    public int create(Payment payment);

    public Payment getPaymentId(long id);

}
