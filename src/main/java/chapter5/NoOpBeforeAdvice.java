/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Janek
 */
public class NoOpBeforeAdvice implements MethodBeforeAdvice
{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        // no-op
    }
    
}
