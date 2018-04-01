package com.epam.lab.Factory;

import com.epam.lab.Command;

public class ExecuteFactory  implements Command{
    @Override
    public void execute() {
            System.out.println("-------Factory Method--------- ");
            FactoryMethod factoryMethod = new FactoryMethod();
            Interviewer interviewer = factoryMethod.getInterviewer("Middle");
            interviewer.askQuestions();
    }
}
