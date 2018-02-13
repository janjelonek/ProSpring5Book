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
public class InjectSimple {
    
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        
        InjectSimple simple = (InjectSimple) ctx.getBean("injectSimpleSpel");
        System.out.println(simple);
        ctx.close();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
    
    public String toString() {
        return "Name: " + name + "\n"
                        + "Age: " + age + "\n"
                        + "Age in Seconds: " + ageInSeconds + "\n"
                        + "Height: " + height + "\n"
                        + "Is Programmer?: " + programmer;
    }
    
}
