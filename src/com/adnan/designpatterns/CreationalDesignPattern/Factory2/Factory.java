package com.adnan.designpatterns.CreationalDesignPattern.Factory2;

public class Factory {
    public static Notification decideNotification(String method){
        if(method.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        } else if (method.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (method.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        throw new IllegalArgumentException("Invalid notification type");
    }
}
