package com.adnan.designpatterns.CreationalDesignPattern.Singelton;

public class Test {
    public static void main(String[] args) {
//        Singelton s1 = new Singelton();
//        Singelton s2 = new Singelton();
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

//        Singelton s3 = Singelton.getInstance();
//        Singelton s4 = Singelton.getInstance();
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());

        Singelton s5 = Singelton.getInstance();
        Singelton s6 = Singelton.getInstance();
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());
    }
}
