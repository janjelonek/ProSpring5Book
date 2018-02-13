/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import chapter3.Guitar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author Janek
 */
public class ComplexAdvice {

    public void simpleBeforeAdvice(JoinPoint joinPoint, Guitar value) {
        if (value.getBrand().equals("Gibson")) {
            System.out.println("Executing: "
                    + joinPoint.getSignature().getDeclaringTypeName() + " "
                    + joinPoint.getSignature().getName());
        }
    }

    public Object simpleAroundAdvice(ProceedingJoinPoint pjp, Guitar value)
            throws Throwable {

        System.out.println("Before execution: "
                + pjp.getSignature().getDeclaringTypeName() + " "
                + pjp.getSignature().getName()
                + " argument: " + value.getBrand());

        Object retVal = pjp.proceed();

        System.out.println("After execution: "
                + pjp.getSignature().getDeclaringTypeName() + " "
                + pjp.getSignature().getName()
                + " argument: " + value.getBrand());
        
        return retVal;
    }
}
