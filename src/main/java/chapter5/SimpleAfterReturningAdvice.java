/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 *
 * @author Janek
 */
public class SimpleAfterReturningAdvice implements AfterReturningAdvice {
    
    public static void main(String[] args) {
        Guitarist target = new Guitarist();
        
        ProxyFactory pf = new ProxyFactory();
        
        pf.addAdvice(new SimpleAfterReturningAdvice());
        pf.setTarget(target);
        
        Guitarist proxy = (Guitarist) pf.getProxy();
        proxy.sing();
    }

    @Override
    public void afterReturning(Object returnValue, Method method, 
            Object[] args, Object target) throws Throwable {
        System.out.println("After '" + method.getName()+ "' put down guitar.");
    }
    
}
