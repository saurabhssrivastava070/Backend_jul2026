package org.child2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
         Config config = context.getBean(Config.class);
         config.printConfig();
//         Travel travelabcd = context.getBean("tr1", Travel.class);
//
//        travelabcd.printmodeofTravel();
       // ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        AppController controller = context.getBean(AppController.class);
        AppController controller2 = context.getBean(AppController.class);
        System.out.println("first controller "+controller.hashCode());
        System.out.println("second controller "+controller2.hashCode());
       //controller.printAppcontroller();
        //IPayment p1 = context.getBean("cardpay", IPayment.class);
        //IPayment p2 = context.getBean("upipay", IPayment.class);
//        //CardPayment cardPayment = context.getBean(CardPayment.class);
//       // System.out.println(cardPayment);
        //controller.payment = p1;
       // controller.pay();
        //System.out.println("========for upi========"+p1.getClass());
        //controller.payment = p2;
        //controller.pay();
        context.registerShutdownHook();
    }
}