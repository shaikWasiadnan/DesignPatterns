package com.adnan.designpatterns.CreationalDesignPattern.Factory2;

public class PushNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sending Notification through PUSH");
    }
}
