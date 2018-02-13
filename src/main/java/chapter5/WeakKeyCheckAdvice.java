/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import static chapter5.KeyGenerator.WEAK_KEY;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author Janek
 */
public class WeakKeyCheckAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, 
            Object[] args, Object target) throws Throwable {
        
        if((target instanceof KeyGenerator) 
                && ("getKey".equals(method.getName()))) {
            long key = ((Long) returnValue).longValue();
            
            if (key == WEAK_KEY) {
                throw new SecurityException(
                    "Key Generator generated a weak key. Try again");
            }
        }
    }
    
    
}
