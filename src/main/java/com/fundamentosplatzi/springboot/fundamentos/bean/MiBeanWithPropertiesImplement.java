package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MiBeanWithPropertiesImplement implements MyBeanWithProperties{

    private String nombre, apellido;

    public MiBeanWithPropertiesImplement(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return nombre+ "-" + apellido;
    }
}
