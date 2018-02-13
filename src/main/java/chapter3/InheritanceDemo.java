/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class InheritanceDemo {
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        Singer parent = (Singer) ctx.getBean("parent");
        Singer child = (Singer) ctx.getBean("child");
        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);
    }
}
