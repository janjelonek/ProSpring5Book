/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Janek
 */
public class Singer implements ApplicationContextAware {
    
    ApplicationContext ctx;
    private Guitar guitar;
    private String lyric = "I played a quick game of chess with the salt "
            + "and pepper shaker";
    private String name;
    private int age;
    
    public void sing() {
        guitar = ctx.getBean("gopher", Guitar.class);
        guitar.sing();
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        this.ctx = ac;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString() {
        return "\tName: " + name + "\n\t" + "Age: " + age;
    }
}
