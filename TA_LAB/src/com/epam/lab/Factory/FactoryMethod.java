package com.epam.lab.Factory;

public class FactoryMethod {
    public Interviewer getInterviewer(String InterviewerType) {
        if (InterviewerType == null) {
            return null;
        }
        if (InterviewerType.equalsIgnoreCase("JUNIOR")) {
            return new Junior();

        } else if (InterviewerType.equalsIgnoreCase("MIDDLE")) {
            return new Middle();
        }
        return null;
    }
}
