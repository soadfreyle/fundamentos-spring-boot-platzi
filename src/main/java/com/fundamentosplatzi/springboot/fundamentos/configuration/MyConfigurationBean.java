package com.fundamentosplatzi.springboot.fundamentos.configuration;

import com.fundamentosplatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public MyBean beanOperation(){
        //devuelvo cualquiera de las implementaciones de la dependencia MyBean
        return new MyBeanImplement();
    }

    @Bean
    public MyOperation beanOperationOperation(){

        return new MyOperationImplement();
    }


    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation){
        //pero esta dependencia trae otra depencia como parametro!!! q es (MyOperation myOperation)
        return new MyBeanWithDependencyImplement(myOperation);
    }

}
