/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 *
 * @author Janek
 */
public class DynamicPointcutDemo {
    
    public static void main(String[] args) {
        SampleBean target = new SampleBean();
        
        Advisor advisor = new DefaultPointcutAdvisor(
                new SimpleDynamicPointcut(), new SimpleAdvice());
        
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(target);
        pf.addAdvisor(advisor);
        SampleBean proxy = (SampleBean) pf.getProxy();
        
        proxy.foo(1);
        proxy.foo(10);
        proxy.foo(100);
        
        proxy.bar();
        proxy.bar();
        proxy.bar();
    }
}