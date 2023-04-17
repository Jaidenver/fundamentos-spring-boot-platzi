package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithPropertiesImplement2 implements MyBeanWithProperties2{

    Log LOGGER = LogFactory.getLog(MyBeanWithPropertiesImplement2.class);
    private String nombre, apellido;

    public MyBeanWithPropertiesImplement2(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String funtion2() {
        LOGGER.info("Hemos ingresado al metodo funtion2");
        LOGGER.debug("Nos esta retornando estos datos: " + nombre + apellido);
        return nombre + "-" + apellido;

    }
}
