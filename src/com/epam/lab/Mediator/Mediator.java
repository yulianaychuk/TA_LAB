package com.epam.lab.Mediator;
public interface Mediator {
    void sendMessage(String msg, Colleague colleague);
    void addColleague(Colleague user);
}
