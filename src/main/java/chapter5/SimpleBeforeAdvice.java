/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 *
 * @author Janek
 */
public class SimpleBeforeAdvice implements MethodBeforeAdvice {
    
    public static void main(String[] args) {
        Guitarist johnMayer = new Guitarist();
        
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SimpleBeforeAdvice());
        pf.setTarget(johnMayer);
        
        Guitarist proxy = (Guitarist) pf.getProxy();
        
        proxy.sing();
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Before '" + method.getName() + "', tune guitar.");
    }
    
    
}
