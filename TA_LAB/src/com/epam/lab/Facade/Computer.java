package com.epam.lab.Facade;

public class Computer {

    void on(){
        System.out.println("Computer was switch on.");
    }
    void off(){
        System.out.println("Computer switched off.");
    }
}
class Monitor{
    void on(){
        System.out.println("Monitor was switch on");
    }
    void off(){
        System.out.println("Monitor switched off");
    }
}
class Sound{
    void on(){
        System.out.println("Sound was switch on");
    }
    void off(){
        System.out.println("Sound switched off");
    }
}

