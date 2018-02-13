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
public class AspectJAnnotationDemo {
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml4.xml");
        ctx.refresh();
        
        NewDocumentarist documentarist = 
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
    }
}
