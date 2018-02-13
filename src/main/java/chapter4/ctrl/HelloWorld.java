/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Janek
 */
@RestController
public class HelloWorld {
    
    @RequestMapping("/")
    public String sayHi() {
        return "Hello World!";
    }
}
