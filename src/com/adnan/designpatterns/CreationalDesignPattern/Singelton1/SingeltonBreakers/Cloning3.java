package com.adnan.designpatterns.CreationalDesignPattern.Singelton1.SingeltonBreakers;

public class Cloning3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonBreakerMain s1 = SingletonBreakerMain.getInstance();
        SingletonBreakerMain s2 =(SingletonBreakerMain) s1.clone();
        System.out.println(s1==s2);
    }
}
/*
inside clone() method directly return the instance instead of super.clone()
 */
