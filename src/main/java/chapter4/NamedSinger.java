/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import org.springframework.beans.factory.BeanNameAware;

/**
 *
 * @author Janek
 */
public class NamedSinger implements BeanNameAware {

    private String name;
    
    @Override
    public void setBeanName(String string) {
        this.name = string;
    }
    
    public void sing() {
        System.out.println("Singer " + name + " - sing()");
    }
    
}
