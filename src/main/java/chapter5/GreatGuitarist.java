/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author Janek
 */
public class GreatGuitarist implements Singer {

    @Override
    public void sing() {
        System.out.println("I shot the sheriff, \n"
                + "But I did not shoot the deputy");
    }

}
