/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import chapter4.DestructiveBeanConfigDemo.DestructiveBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 *
 * @author Janek
 */
public class DestructiveBeanWithHook {
    
    public static void main(String[] args) {
        GenericApplicationContext ctx = 
                new AnnotationConfigApplicationContext(DestructiveBeanConfig.class);
        ctx.getBean(DestructiveBeanWithJSR250.class);
        ctx.registerShutdownHook();
    }
}
