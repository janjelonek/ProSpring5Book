/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.util.Map;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class BeanNamingTest {
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-01.xml");
        ctx.refresh();
        
        Map<String,String> beans = ctx.getBeansOfType(String.class);
        
        beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));
        
        ctx.close();
    }
}
