package com.zlb.spring.test;

import com.zlb.spring.config.HaConfig;
import com.zlb.spring.entity.D;
import com.zlb.spring.entity.Haha;
import com.zlb.spring.invovation.MyInvocationHandler;
import com.zlb.spring.servlet.Ha;
import com.zlb.spring.servlet.impl.Haimpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class Test {

    @org.junit.Test
    public void show() throws Exception{
        System.out.println("hhhhhhhhhhhhhhhhh");
        System.out.println("hhhhhhhhhhhhhhhhh");
        System.out.println("hhhhhhhhhhhhhhhhh");
        System.out.println("this");
        System.out.println("hhhhhhhhhhhhhhhhh");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler( new Haimpl());
        Ha o = (Ha) Proxy.newProxyInstance(Haimpl.class.getClassLoader(), Haimpl.class.getInterfaces(), myInvocationHandler);
        o.show(new Haha());
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean1.xml");
//        Haha bean = classPathXmlApplicationContext.getBean("haha",Haha.class);
//        bean.said();
//        Class c = Class.forName("com.zlb.spring.entity.Haha");
//
//        System.out.println(c);
//        System.out.println(D.class);
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(HaConfig.class);
//        Haha bean = annotationConfigApplicationContext.getBean(Haha.class);
//        bean.said();

    }

}
