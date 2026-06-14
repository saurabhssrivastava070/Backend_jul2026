package org.child2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.beans.BeanProperty;

// propery based
// setter based
// constructor based

@Component
public class AppController {
    @Autowired
    @Qualifier("upipay")
     public IPayment payment;


    @Autowired
    public void setPayment( @Qualifier("upipay") IPayment payment) {
        this.payment = payment;
        System.out.println("=======AppController init with setter======"+ payment);
    }
//
    @Autowired
    public  AppController(@Qualifier("upipay")IPayment payment){
        this.payment = payment;
        System.out.println("=======AppController init with contrustor======");
    }



    void pay(){
        payment.pay();
    }
}
