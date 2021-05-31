package com.wang.springcloud.Controler;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import com.wang.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class IPaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果 :" + result);
        if(result > 0){
            return new CommonResult<Integer>(200,"插入数据成功,serverPort:" + serverPort,result);
        }else {
            return new CommonResult<Integer>(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id){
        Payment result = paymentService.getPaymentId(id);
        log.info("*****插入结果 :" + result);
        System.out.println("????");
        if(result != null){
            return new CommonResult<Payment>(200,"查询成功,serverPort:" + serverPort,result);
        }else {
            return new CommonResult<Payment>(444,"查询失败,查询ID:" + id,null);
        }
    }
}
