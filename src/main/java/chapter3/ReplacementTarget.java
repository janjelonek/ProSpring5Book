/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author Janek
 */
public class ReplacementTarget {
    
    public String formatMessage(String msg) {
        return "<h1>" + msg + "</h1>";
    }
    
    public String formatMessage(Object msg) {   
        return "<h1>" + msg + "</h1>";
    }
}
