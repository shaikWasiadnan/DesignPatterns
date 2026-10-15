package com.adnan.designpatterns.CreationalDesignPattern.Factory2;

public class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification through SMS");
    }
}
