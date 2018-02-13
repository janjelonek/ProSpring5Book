/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class MessageDigestFactoryDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx
                = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        MessageDigester digester = ctx.getBean("digester",
                MessageDigester.class);
        digester.digest("Hello World!");
        ctx.close();
    }
}
