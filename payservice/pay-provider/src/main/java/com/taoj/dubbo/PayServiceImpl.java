package com.taoj.dubbo;

public class PayServiceImpl implements IPayService {
    @Override
    public String pay(String info) {
        System.out.println("execute pay"+info);
        return "Hello dubbo"+info;
    }
}
