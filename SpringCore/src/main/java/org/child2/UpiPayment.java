package org.child2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("upipay")
public class UpiPayment implements IPayment {
    @Override
    public void pay() {
        System.out.println("===Payment Through UPI=======");
    }

    public  UpiPayment(){
        System.out.println("=========UpiPayment init===========");
    }
}
