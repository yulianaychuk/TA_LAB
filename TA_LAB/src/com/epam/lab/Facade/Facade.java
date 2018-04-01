package com.epam.lab.Facade;

public class Facade {

    private Computer computer = new Computer();
    private Monitor monitor = new Monitor();
    private Sound sound = new Sound();
    private boolean onOrOff = false;
    public void switchOn(){
        computer.on();
        monitor.on();
        sound.on();
        onOrOff = true;
    }
    public void switchOff(){
        if (onOrOff){
            computer.off();
            monitor.off();
            sound.off();
        }
        else {
            System.out.println("Computer switched off. ");
        }
    }

}
