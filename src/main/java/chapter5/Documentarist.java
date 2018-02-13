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
public class Documentarist {
    
    protected GrammyGuitarist guitarist;
    
    public void execute() {
        guitarist.sing();
        guitarist.talk();
    }
    
    public void setGuitarist(GrammyGuitarist guitarist) {
        this.guitarist = guitarist;
    }
}
