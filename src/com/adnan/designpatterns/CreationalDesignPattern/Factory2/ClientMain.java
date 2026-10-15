package com.adnan.designpatterns.CreationalDesignPattern.Factory2;

public class ClientMain {
    public static void main(String[] args) {
        Notification n = Factory.decideNotification("sms");
        n.sendNotification();
        Notification n2 = Factory.decideNotification("EMail");
        n2.sendNotification();
        Notification n3 = Factory.decideNotification("pUSh");
        n3.sendNotification();
    }
}
/*
Factory Design Pattern:
->Factory Design Pattern is all about creating objects.
->But if there is a process which has different implementations then which object has to be created
will be decided during RunTime depending upon response from Client then we will go with
Factory Design Pattern.Where object creation logic will be present inside Factory class.
Upon client response object will be created.
 */