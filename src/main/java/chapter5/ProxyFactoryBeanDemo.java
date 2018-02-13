/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class ProxyFactoryBeanDemo {
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-context-xml2.xml");
        ctx.refresh();
        
        Documentarist documentaristOne = 
                (Documentarist) ctx.getBean("documentaristOne");
        Documentarist documentaristTwo = 
                ctx.getBean("documentaristTwo", Documentarist.class);
        
        System.out.println("Documentarist One >>");
        documentaristOne.execute();
        
        System.out.println("Documentarist Two >>");
        documentaristTwo.execute();
    }
    
}
