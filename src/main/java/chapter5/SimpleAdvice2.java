/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.aspectj.lang.JoinPoint;

/**
 *
 * @author Janek
 */
public class SimpleAdvice2 {
    
    public void simpleBeforeAdvice(JoinPoint joinPoint) {
        System.out.println("Executing: " + 
                joinPoint.getSignature().getDeclaringTypeName() + " " + 
                joinPoint.getSignature().getName());
    }
}
