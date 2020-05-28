package testproxy.impl;

import staticproxy.PetDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import java.util.Date;

/**
 * 基于接口的动态代理，jdk提供
 */
public class DogDaoProxyImpl<T> implements InvocationHandler {

    private T object;

    public DogDaoProxyImpl(T object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理开始"+new Date());
        Object objectresult =  method.invoke(object,args);
        System.out.println("动态代理结束"+new Date());
        return objectresult;
    }
}
