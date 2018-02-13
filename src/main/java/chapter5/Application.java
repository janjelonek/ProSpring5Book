/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author Janek
 */

@SpringBootApplication
public class Application {
    
    private static Logger logger = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext ctx = 
                SpringApplication.run(Application.class, args);
        assert(ctx != null);
        
        NewDocumentarist documentarist = 
                ctx.getBean("documentarist", NewDocumentarist.class);
        documentarist.execute();
        
        System.in.read();
        ctx.close();
    }
}
