/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Janek
 */

@Component
public class HelloWorld {
    
    private static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    
    public void sayHi() {
        logger.info("Hello world!");
    }
    
}
