package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyOwnDependencyImplement implements MyOwnDependency{

    private MyOwnOperation myOwnOperation;

    public MyOwnDependencyImplement(MyOwnOperation myOwnOperation) {
        this.myOwnOperation = myOwnOperation;
    }

    @Override
    public void printOwnDependency() {
        int numero = 10;
        System.out.println("La resta de tu numero con la función es : " + myOwnOperation.rest(numero));
        System.out.println("Hola desde mi propia dependencia JAIDENVER");
    }


}
