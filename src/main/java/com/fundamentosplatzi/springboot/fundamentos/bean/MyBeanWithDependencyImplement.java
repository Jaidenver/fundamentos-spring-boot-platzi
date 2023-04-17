package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }


    @Override
    public void printWithDependency() {

        LOGGER.info("Hemos ingresado al metodo printWithDependency");
        int numero = 10;
        LOGGER.debug("El numero enviado como parametro a la dependencia operacion es:" + numero);
        System.out.println("La suma de tu numero con la función es:  " + myOperation.sum(numero));
        System.out.println("HOLA DESDE MI DEPENDENCIA ORIGINAL ");

    }
}
