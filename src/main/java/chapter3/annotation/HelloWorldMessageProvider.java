/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.annotation;

import hello.world.MessageProvider;
import org.springframework.stereotype.Component;

/**
 *
 * @author Janek
 */
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {
    
    @Override
    public String getMessage() {
        return "Hello World!";
    }
    
}
