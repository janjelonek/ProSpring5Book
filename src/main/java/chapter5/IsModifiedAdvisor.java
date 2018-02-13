/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 *
 * @author Janek
 */
public class IsModifiedAdvisor extends DefaultIntroductionAdvisor {
    
    public IsModifiedAdvisor() {
        super(new IsModifiedMixin());
    }
}
