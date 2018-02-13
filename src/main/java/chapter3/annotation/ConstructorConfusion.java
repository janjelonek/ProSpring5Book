/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 *
 * @author Janek
 */
@Service("constructorConfusion")
public class ConstructorConfusion {
    
    private String someValue;
    
    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }
    
    @Autowired
    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }
    
    public String toString() {
        return someValue;
    }
    
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        ConstructorConfusion cc = (ConstructorConfusion)
        ctx.getBean("constructorConfusion");
        System.out.println(cc);
        ctx.close();
    }
}
