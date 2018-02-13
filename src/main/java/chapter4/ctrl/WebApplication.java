/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.ctrl;

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
public class WebApplication {
    
    private static Logger logger = LoggerFactory.getLogger(WebApplication.class);
    
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext ctx = 
                SpringApplication.run(WebApplication.class, args);
        
        assert(ctx != null);
        logger.info("Application started...");
        
        System.in.read();
        ctx.close();
    }
}
