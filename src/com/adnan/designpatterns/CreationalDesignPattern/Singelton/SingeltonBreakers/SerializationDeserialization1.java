package com.adnan.designpatterns.CreationalDesignPattern.Singelton.SingeltonBreakers;
import java.io.*;

public class SerializationDeserialization1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonBreakerMain s1 = SingletonBreakerMain.getInstance();
        String  f = "C:\\Users\\SHAIK IDREES\\OneDrive\\Desktop\\example.txt";
        FileOutputStream file = new FileOutputStream(f);
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        outputStream.writeObject(s1);
        outputStream.close();
        file.close();
        System.out.println(s1.hashCode());
        s1 = null;
        FileInputStream f2 = new FileInputStream(f);
        ObjectInputStream objectInputStream = new ObjectInputStream(f2);
        SingletonBreakerMain obj = (SingletonBreakerMain) objectInputStream.readObject();
        objectInputStream.close();
        f2.close();
        System.out.println(obj.hashCode());
    }
}
