/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.springframework.aop.framework.ProxyFactory;

/**
 *
 * @author Janek
 */
public class AgentAOPDemo {
    public static void main(String[] args) {
        Agent target = new Agent();
        
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new AgentDecorator());
        pf.setTarget(target);
        
        Agent proxy = (Agent) pf.getProxy();
        
        target.speak();
        System.out.println("");
        proxy.speak();
    }
}
