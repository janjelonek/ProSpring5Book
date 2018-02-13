/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author Janek
 */

@Configuration
@ComponentScan(basePackages = {"chapter5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
    
}
