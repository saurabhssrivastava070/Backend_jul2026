package org.child2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cardpay")
public class CardPayment implements  IPayment{
    @Override
    public void pay() {
        System.out.println("===Payment Through Card=======");

    }

    public  CardPayment(){
        System.out.println("=========CardPayment init===========");
    }
}
