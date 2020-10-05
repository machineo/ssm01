package cn.mm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.TestExecutionListeners;

@Component  //加这个注解，才能扫描到
public class Service2 {
    //spring管理的类中才能用这些注解，所以必须加component注解
    //使用这个注解，自身就必须是一个spring bean
    @Autowired
    private Service1 service1;

    public void testAnno(){
        System.out.println("service2");
        service1.fun1();
    }

//    public static void main(String[] args) {
//        Service2 service2 = new Service2();
//        service2.testAnno();
//    }
}
