package org.child2;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.beans.BeanProperty;

// propery based
// setter based
// constructor based

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class AppController  {
   // @Autowired
    //@Qualifier("upipay")
     public IPayment payment;

//
//    @Autowired
//    public void setPayment( @Qualifier("upipay") IPayment payment) {
//        this.payment = payment;
//        System.out.println("=======AppController init with setter======"+ payment);
//    }
//
    @Autowired
    public  AppController(@Qualifier("upipay")IPayment payment){
        this.payment = payment;
      //  System.out.println("dependency of "+ payment.hashCode());
        pay();
        System.out.println("=======AppController init with contrustor======");
    }



    void pay(){
        payment.pay();
    }

    void printAppcontroller(){
        System.out.println("Callinng one of appcontroler method");
    }
    @PostConstruct
    public void myafterconstruct() throws Exception {
        System.out.println("AppController Bean is ready");
    }

    @PreDestroy
    public void mydestry() throws Exception {
        System.out.println("Appcontroler destroyed");
    }
}
