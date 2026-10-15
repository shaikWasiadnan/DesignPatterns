package com.adnan.designpatterns.CreationalDesignPattern.Singelton1.SingeltonBreakers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonBreakerMain s1 = SingletonBreakerMain.getInstance();
        //using reflection
        Class<SingletonBreakerMain> reflectionClass = SingletonBreakerMain.class;
        Constructor<SingletonBreakerMain> reflectionConstructor = reflectionClass.getDeclaredConstructor();
        reflectionConstructor.setAccessible(true);
        SingletonBreakerMain s2 = reflectionConstructor.newInstance();
        System.out.println(s1 == s2);
    }
}
