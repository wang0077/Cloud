package com.wang.springcloud.service;

import com.wang.springcloud.entities.Payment;

public interface IPaymentService {

    public int create(Payment payment);

    public Payment getPaymentId(long id);

}
