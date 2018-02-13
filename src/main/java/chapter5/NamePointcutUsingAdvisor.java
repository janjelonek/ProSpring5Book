/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import chapter3.Guitar;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 *
 * @author Janek
 */
public class NamePointcutUsingAdvisor {
    
    public static void main(String[] args) {
        GrammyGuitarist johnMayer = new GrammyGuitarist();
        
        NameMatchMethodPointcutAdvisor advisor = 
                new NameMatchMethodPointcutAdvisor(new SimpleAdvice());
        advisor.addMethodName("sing");
        advisor.addMethodName("rest");
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(johnMayer);
        pf.addAdvisor(advisor);
        
        GrammyGuitarist proxy = (GrammyGuitarist) pf.getProxy();
        proxy.sing();
        proxy.sing(new Guitar());
        proxy.rest();
        proxy.talk();
    }
}
