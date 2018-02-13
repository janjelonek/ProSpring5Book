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
public class PlaceHolderDemo {

    public static void main(String[] args) {
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/app-context-xml.xml");
            ctx.refresh();
            AppProperty appProperty = ctx.getBean("appProperty",
                    AppProperty.class);
            System.out.println("application.home: "
                    + appProperty.getApplicationHome());
            System.out.println("user.home: "
                    + appProperty.getUserHome());
        }
    }
}
