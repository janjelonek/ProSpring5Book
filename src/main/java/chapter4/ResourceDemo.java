/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.io.File;
import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 *
 * @author Janek
 */
public class ResourceDemo {
    
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        
        File file = File.createTempFile("test", "txt");
        file.deleteOnExit();
        
        Resource res1 = ctx.getResource("file:///" + file.getPath());
        displayInfo(res1);
        
        Resource res2 = ctx.getResource("classpath:test.txt");
        displayInfo(res2);
        
        Resource res3 = ctx.getResource("http://www.google.com");
        displayInfo(res3);
    }
    
    private static void displayInfo(Resource res) throws IOException {
        System.out.println(res.getClass());
        System.out.println(res.getURL().getContent());
        System.out.println("");
    }
    
}
