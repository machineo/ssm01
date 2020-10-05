package cn.mm.demo;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.security.krb5.Config;

public class demo1 {
    public static void main(String[] args) {
        //生成一个ioc容器，配置就是按Config1这个class里的配置
//        ApplicationContext cxt = new AnnotationConfigApplicationContext(Config1.class);
        ApplicationContext cxt = new AnnotationConfigApplicationContext("cn.mm.demo");
        Service2 service2 = cxt.getBean(Service2.class);
        service2.testAnno();
    }
}
