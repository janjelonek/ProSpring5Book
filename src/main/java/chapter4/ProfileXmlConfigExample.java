/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

import java.util.List;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author Janek
 */
public class ProfileXmlConfigExample {
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("highschool");
        ctx.load("classpath:spring/*-config.xml");
        ctx.refresh();
        
        FoodProviderService foodProviderService = 
                ctx.getBean("foodProviderService", FoodProviderService.class);
        
        List<Food> lunchSet = foodProviderService.provideLunchSet();
        
        for(Food food:lunchSet) {
            System.out.println("Food: " + food.getName());
        }
        
        ctx.close();
    }
}
