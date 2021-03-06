/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import chapter3.Guitar;
import org.springframework.stereotype.Component;

/**
 *
 * @author Janek
 */
@Component("johnMayer")
public class GrammyGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("sing: Gravity is working against me\n"
                + "And gravity wants to bring me down");
    }
    
    public void sing(Guitar guitar) {
        System.out.println("play: " + guitar.play());
    }
    
    public void rest() {
        System.out.println("zzz");
    }
    
    public void talk() {
        System.out.println("talk");
    }

}
