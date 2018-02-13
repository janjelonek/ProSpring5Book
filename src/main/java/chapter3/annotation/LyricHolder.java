/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.annotation;

import chapter3.ContentHolder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Janek
 */

@Service("lyricHolder")
public class LyricHolder implements ContentHolder {
    
    private String value = "'You be the DJ, I'll be the driver'";
    
    @Override 
    public String toString() {
        return "LyricHolder: { " + value + "}";
    }
}
