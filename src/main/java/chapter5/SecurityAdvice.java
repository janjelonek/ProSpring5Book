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
public class SecurityAdvice implements MethodBeforeAdvice {
    
    private SecurityManager securityManager;

    public SecurityAdvice() {
        this.securityManager = new SecurityManager();
    }
    
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        UserInfo user = securityManager.getLoggedOnUser();
        
        if (user == null) {
            System.out.println("No user authenticated");
            throw new SecurityException(
                "You must login before attempting to invoke the method: " 
                        + method.getName()
            );
        } else if ("John".equals(user.getUserName())) {
            System.out.println("Logged in user is John - OKAY!");
        } else {
            System.out.println("Logged in user is " + user.getUserName() 
                    + " NOT GOOD :(");
            throw new SecurityException("User " + user.getUserName() 
                    + " is not allowed access to method " + method.getName());
        }
    }
    
}
