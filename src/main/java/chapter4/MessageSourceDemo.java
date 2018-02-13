/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.Locale;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class MessageSourceDemo {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();
        
        Locale english = Locale.ENGLISH;
        Locale german = new Locale("de", "DE");
        
        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, german));
        
        System.out.println(ctx.getMessage("nameMsg", new Object[]
            { "John", "Mayer" }, english));
        System.out.println(ctx.getMessage("nameMsg", new Object[]
            { "John", "Mayer" }, german));
        
        ctx.close();
    }
}
