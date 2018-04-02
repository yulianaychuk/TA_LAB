package com.epam.lab.Mediator;
public class Farmer extends Colleague {
    public Farmer(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void receive(String msg) {
        String tomato = "Tomato";
        System.out.println(String.format(
                "%s raised %s from bought %s",this.getClass().getName(),tomato,msg));
        mediator.sendMessage(tomato, this);
    }
}
