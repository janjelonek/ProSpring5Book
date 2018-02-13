/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.sandbox;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

/**
 *
 * @author Janek
 */

@Configuration
public class TargetConfig {
    
    @Bean
    public Foo fooImplOne() {
        return new FooImplOne();
    }
    
    @Bean
    public Foo fooImplTwo() {
        return new FooImplTwo();
    }
    
    @Bean
    public Bar bar() {
        return new Bar();
    }
    
    @Bean
    public TrickyTarget trickyTarget() {
        return new TrickyTarget();
    }
    
    public static void main(String... args) {
        GenericApplicationContext ctx =
            new AnnotationConfigApplicationContext(TargetConfig.class);
        TrickyTarget t = ctx.getBean(TrickyTarget.class);
        ctx.close();
    }
}
