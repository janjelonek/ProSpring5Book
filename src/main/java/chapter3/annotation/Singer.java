/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Janek
 */

//@Service("singer")
@Component("nonSingleton")
@Scope("prototype")
public class Singer {
    
    private String name = "unknown";
    
    public Singer(String name) {
        this.name = name;
    }
    
    @Autowired
    private Inspiration inspirationBean;
    
    public void sing() {
        System.out.println("..." + inspirationBean.getLyric());
    }
}
