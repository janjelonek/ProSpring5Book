/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.lang.reflect.Method;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

/**
 *
 * @author Janek
 */
public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {

    @Override
    public boolean matches(Method method, Class<?> cls) {
        System.out.println("Static check for " + method.getName());
        return ("foo".equals(method.getName()));
    }
    
    @Override
    public boolean matches(Method method, Class<?> type, Object... os) {
        System.out.println("Dynamic check for " + method.getName());
        int x = ((Integer) os[0]).intValue();
        return (x != 100);
    }
    
    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == SampleBean.class);
    }
    
}
