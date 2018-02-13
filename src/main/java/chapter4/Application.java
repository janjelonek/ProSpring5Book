/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.io.IOException;
import java.util.Arrays;
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
        logger.info("The beans you were looking for:");
        
        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(logger::info);
        
        HelloWorld hw = ctx.getBean(HelloWorld.class);
        hw.sayHi();
        
        System.in.read();
        ctx.close();
    }
}
