/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.security.MessageDigest;

/**
 *
 * @author Janek
 */
public class MessageDigestFactory {
    
    private String algorithmName = "MD5";
    
    public MessageDigest createInstance() throws Exception {
        return MessageDigest.getInstance(algorithmName);
    }
    
    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }
}
