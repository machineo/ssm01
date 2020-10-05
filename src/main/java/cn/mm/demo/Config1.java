package cn.mm.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类
//@Configuration
public class Config1{

    //bean的名字就是service1（方法名）
    @Bean(name = "service2")  //直接写字符串会赋给value，这里没有value，需要写name=""
    public Service1 service1(){
        return new Service1();
    }
}
