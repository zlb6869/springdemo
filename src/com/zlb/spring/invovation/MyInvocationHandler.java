package com.zlb.spring.invovation;

import com.zlb.spring.servlet.impl.Haimpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    Haimpl haimpl;

    public MyInvocationHandler(Haimpl h){
        this.haimpl = h;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("qian");
        Object invoke = method.invoke(haimpl, objects);

        System.out.println("hou");
        return null;
    }
}
