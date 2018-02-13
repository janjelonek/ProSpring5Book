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
public class Guitar {
    
    private String brand = "Martin";
    
    public void sing(){
        System.out.println("Cm Eb Fm Ab Bb");
    }
    
    public String play() {
        return "Cm Eb Fm Ab Bb";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
