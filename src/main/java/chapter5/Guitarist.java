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
public class Guitarist implements Singer {
    
    private String lyric = "You're gonna live forever in me";

    @Override
    public void sing(){
        System.out.println(lyric);
    }
    
    @AdviceRequired
    public void sing2() {
        System.out.println("Just keep me where the light is");
    }
    
    public void rest() {
        System.out.println("zzz");
    }
}
