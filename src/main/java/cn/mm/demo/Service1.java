package cn.mm.demo;

import org.springframework.stereotype.Component;

/**
 * 被注入的类
 */
@Component
public class Service1 {

    public void fun1(){
        System.out.println("service......");
    }
}
