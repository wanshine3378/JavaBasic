package com.example.demo;
import java.util.logging.*;
import java.lang.reflect.*;


/*
 * 2021/01/27
 * 動態代理相關
 */

public class DynamicProxy implements InvocationHandler{
    
    private Logger logger = Logger.getLogger((this.getClass().getName());
    
    private Object delegate;
    
    private Object bind(Object delegate ) {
        this.delegate = delegate;
        return Porxy.newProxyInstance()
    }

}
