package com.epam.lab.Factory;

public class Junior implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Interviewer Junior, easy questions");
    }
}
