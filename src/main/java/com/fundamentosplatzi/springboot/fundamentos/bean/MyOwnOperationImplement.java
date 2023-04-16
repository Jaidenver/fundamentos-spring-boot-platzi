package com.fundamentosplatzi.springboot.fundamentos.bean;


import org.springframework.stereotype.Service;

@Service
public class MyOwnOperationImplement implements MyOwnOperation{
    @Override
    public int rest(int num) {
        return num-1;
    }
}
