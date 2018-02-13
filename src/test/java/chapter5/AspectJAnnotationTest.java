/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class AspectJAnnotationTest {
    
    @Test
    public void xmlTest() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml4.xml");
        ctx.refresh();
        
        NewDocumentarist documentarist = 
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
        
        ctx.close();
    }
    
    @Test
    public void configTest() {
        GenericApplicationContext ctx = 
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        NewDocumentarist documentarist = 
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
        
        ctx.close();
    }
}
