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
public class WorkerBean {
    
    public void doSomeWork(int noOfTimes) {
        for (int x = 0; x < noOfTimes; x++) {
            work();
        }
    }
    
    private void work() {
        System.out.println("");
    }
}
