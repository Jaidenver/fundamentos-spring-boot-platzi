package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement2 implements MyBeanWithProperties2{

    private String nombre, apellido;

    public MyBeanWithPropertiesImplement2(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String funtion2() {
        return nombre + "-" + apellido;
    }
}
