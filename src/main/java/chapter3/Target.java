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
public class Target {
    
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;
    
    public Target() {}
    
    public Target(Foo foo) {
        System.out.println("Target(Foo) called");
    }
    
    public Target(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }
    
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }
    
    public void setFooTwo(Foo fooTwo) {
        this.fooTwo = fooTwo;
        System.out.println("Property fooTwo set");
    }
    
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }
    
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-03.xml");
        ctx.refresh();
        Target t = null;
        System.out.println("Using byName:\n");
        t = (Target) ctx.getBean("targetByName");
        System.out.println("\nUsing byType:\n");
        t = (Target) ctx.getBean("targetByType");
        System.out.println("\nUsing constructor:\n");
        t = (Target) ctx.getBean("targetConstructor");
        ctx.close();
    }
}
