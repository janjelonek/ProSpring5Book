/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Janek
 */

@Component
public class Inspiration {
    
    private String lyric = 
            "I can keep the door cracked open, to let light through";
    
    public Inspiration(
            @Value("For all my running, I can understand") String lyric) {
        this.lyric = lyric;
    }
    
    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }
    
}
