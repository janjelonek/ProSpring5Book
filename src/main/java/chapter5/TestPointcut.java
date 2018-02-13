/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.lang.reflect.Method;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

/**
 *
 * @author Janek
 */
public class TestPointcut extends StaticMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> type) {
        return ("advised".equals(method.getName()));
    }
    
    
}
