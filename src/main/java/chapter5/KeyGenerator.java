/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import java.util.Random;

/**
 *
 * @author Janek
 */
public class KeyGenerator {
    protected static final long WEAK_KEY = 0xFFFFFFF0000000L;
    protected static final long STRONG_KEY = 0xACDF03F590AE56L;
    
    private Random rand = new Random();
    
    public long getKey() {
        int x = rand.nextInt(3);
        
        if (x == 1) {
            return WEAK_KEY;
        }
        
        return STRONG_KEY;
    }
}
