/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.annotation;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 *
 * @author Janek
 */

@Service("injectCollection")
public class CollectionInjection {
    
    @Resource(name="map")
    private Map<String, Object> map;
    
    @Resource(name="props")
    private Properties props;
    
    @Resource(name="set")
    private Set set;
    
    @Resource(name="list")
    private List list;
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        
        CollectionInjection instance = 
                (CollectionInjection) ctx.getBean("injectCollection");
        instance.displayInfo();
        
        ctx.close();
    }
    
    public void displayInfo() {
        System.out.println("Map contents:\n");
        map.entrySet().stream().forEach(e -> System.out.println(
                "Key: " + e.getKey() + " - Value: " + e.getValue()));
        
        System.out.println("\nProperties contents:\n");
        props.entrySet().stream().forEach(e -> System.out.println(
                "Key: " + e.getKey() + " - Value: " + e.getValue()));
        
        System.out.println("\nSet contents:\n");
        set.forEach(obj -> System.out.println("Value " + obj));
        
        System.out.println("\nList contents:\n");
        list.forEach(obj -> System.out.println("Value " + obj));
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public void setList(List list) {
        this.list = list;
    }
}
