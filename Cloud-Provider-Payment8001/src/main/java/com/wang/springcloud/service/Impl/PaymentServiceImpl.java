package com.wang.springcloud.service.Impl;

import com.wang.springcloud.Dao.PaymentDao;
import com.wang.springcloud.entities.Payment;
import com.wang.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentId(long id) {
        return paymentDao.getPaymentId(id);
    }
}
