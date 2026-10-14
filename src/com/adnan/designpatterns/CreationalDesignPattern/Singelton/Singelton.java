package com.adnan.designpatterns.CreationalDesignPattern.Singelton;

public class Singelton {
    //Eager Initialization
    //private static Singelton eagerObj = new Singelton();
    //Lazy Initialization
    //private static Singelton lazyObj;

    //Double checked locking
    //private static volatile Singelton lockObj;
    private Singelton(){

    }
//    public static Singelton getInstance(){
//        return eagerObj;
//    }
//    public static Singelton getInstance(){
//        if(lazyObj == null){
//            lazyObj = new Singelton();
//        }
//        return lazyObj;
//    }

//    synchronized public static Singelton getInstance(){
//        if(lazyObj == null){
//            lazyObj = new Singelton();
//        }
//        return lazyObj;
//    }
//    public static Singelton getInstance(){
//        System.out.println("Inside my getInstanceMethod");
//        System.out.println("Inside Multithreaded environment");
//        //multiple lines
//        synchronized (Singelton.class){
//            if(lazyObj == null){
//                lazyObj = new Singelton();
//            }
//            return lazyObj;
//        }
//    }

    //Double checked locking
//    public static Singelton getInstance(){
//        System.out.println("Inside my getInstanceMethod");
//       System.out.println("Inside Multithreaded environment");
//        //multiple lines
//        if(lockObj == null){
//            synchronized (Singelton.class){
//                if(lockObj == null){
//                    lockObj = new Singelton();
//                }
//
//            }
//        }
//        return lockObj;
//    }

    //BillPaughSolution (SingeltonHolder)
    private static class SingeltonHolder{
        private static final Singelton INSTANCE = new Singelton();
    }
    public static Singelton getInstance(){
        return SingeltonHolder.INSTANCE;
    }

}
