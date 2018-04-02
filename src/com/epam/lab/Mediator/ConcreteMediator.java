package com.epam.lab.Mediator;
import java.util.ArrayList;

public class ConcreteMediator implements Mediator{
    private ArrayList<Colleague> colleagueList;
    public ConcreteMediator() {
        this.colleagueList = new ArrayList<>();
    }
    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }
    @Override
    public void sendMessage(String msg, Colleague colleague) {
    for(Colleague someColleague: colleagueList) {
        //If the sender is a farmer then there is a new crop Cannery
        //We are reporting this to the factory
            if (someColleague.getClass()==Cannery.class &&
                    colleague.getClass()==Farmer.class){
                someColleague.receive(msg);
            }
        //If the sender is Cannery, then there is a new product
        //Report this Shop
            if (someColleague.getClass()==Shop.class &&
                    colleague.getClass()==Cannery.class){
                someColleague.receive(msg);
            }
        }
    }
}
