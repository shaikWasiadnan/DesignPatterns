package com.adnan.designpatterns.CreationalDesignPattern.Singelton1.SingeltonBreakers;

import java.io.Serializable;

public class SingletonBreakerMain implements Serializable,Cloneable {
    /*
    To prevent Reflection breaking singelton add code to constructor
     */
    private SingletonBreakerMain(){
       if(SingletonHolder.INSTANCE != null){
           throw new RuntimeException("Object already exist dont create new using reflection");
       }
    }
    private static class SingletonHolder{
        private static final SingletonBreakerMain INSTANCE = new SingletonBreakerMain();
    }
    public static SingletonBreakerMain getInstance(){
        return SingletonHolder.INSTANCE;
    }
    /*to prevent creating a new object during deserialization we can override
    readResolve() method so during deserialization java sees the readResolve method instead of
    returning a new copy of object it return whatever readResolve() returns
    */
    protected Object readResolve(){
        return SingletonHolder.INSTANCE;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return SingletonHolder.INSTANCE;
    }

}
