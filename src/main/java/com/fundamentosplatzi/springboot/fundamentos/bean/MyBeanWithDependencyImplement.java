package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{


    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }


    @Override
    public void printWithDependency() {
        int numero = 10;
        System.out.println("La suma de tu numero con la función es:  " + myOperation.sum(numero));
        System.out.println("HOLA DESDE MI DEPENDENCIA ORIGINAL ");
    }
}
