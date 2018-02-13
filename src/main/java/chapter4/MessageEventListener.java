/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import org.springframework.context.ApplicationListener;

/**
 *
 * @author Janek
 */
public class MessageEventListener implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent e) {
        MessageEvent msgEvt = e;
        System.out.println("Received: " + msgEvt.getMessage());
    }
    
}
