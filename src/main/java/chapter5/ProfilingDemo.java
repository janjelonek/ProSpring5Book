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
public class ProfilingDemo {
    
    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        bean.doSomeWork(100000);
    }
    
    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();
        
        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new ProfilingInterceptor());
        
        return (WorkerBean) factory.getProxy();
    }
}
