/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;

/**
 *
 * @author Janek
 */
public class AnnotationPointcutDemo {
    
    public static void main(String[] args) {
        Guitarist johnMayer = new Guitarist();
        
        AnnotationMatchingPointcut pc = AnnotationMatchingPointcut
                .forMethodAnnotation(AdviceRequired.class);
        Advisor advisor = new DefaultPointcutAdvisor(pc, new SimpleAdvice());
        
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);
        Guitarist proxy = (Guitarist) pf.getProxy();
        
        proxy.sing();
        proxy.sing2();
        proxy.rest();
    }
}
