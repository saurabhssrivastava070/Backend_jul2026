package org.child2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"org.child2"})
public class Config {
    public  void printConfig(){
        System.out.println("i'm from config class");
    }

//    @Bean("tr1")
//    Travel travel1(){
//        Travel travel = new Travel();
//        travel.modeOftavel = "Train";
//        return  travel;
//    }
//
//    @Bean("tr2")
//    Travel travel2(){
//        Travel travel = new Travel();
//        travel.modeOftavel = "Flight";
//        return  travel;
//    }
}
