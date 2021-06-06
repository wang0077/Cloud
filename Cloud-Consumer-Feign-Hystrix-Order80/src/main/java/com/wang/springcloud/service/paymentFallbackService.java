package com.wang.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public class paymentFallbackService implements paymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------PaymentFallbackService fall back OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------PaymentFallbackService fall back TimeOut";
    }
}
