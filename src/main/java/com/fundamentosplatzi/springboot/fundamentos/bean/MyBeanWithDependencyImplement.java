package com.fundamentosplatzi.springboot.fundamentos.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//inyectar esta dependencia en otra clase, primero hay q configuration
public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

     Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);


    //inyecto la otra dependencia
    private MyOperation myOperation;

    //creo constructor de mi clase
    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodo printWithDependency");
        int numero= 1;
        LOGGER.debug("el numero enviado como parametro a la dependencia  operacion es :" + numero);
        System.out.println(myOperation.sum(numero));
        System.out.println("hola desde la implementacion de un bean con dependencia");
    }
}
