
import chapter4.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Janek
 */
public class GroovyBeansFromJava {
    
    public static void main(String[] args) {
        ApplicationContext context = 
                new GenericGroovyApplicationContext("classpath:beans.groovy");
        Singer singer = context.getBean("singer", Singer.class);
        System.out.println(singer);
    }
}
