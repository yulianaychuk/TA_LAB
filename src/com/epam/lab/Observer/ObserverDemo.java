package com.epam.lab.Observer;

import com.epam.lab.Command;

import java.io.BufferedReader;
import java.io.FileReader;

public class ObserverDemo implements Command {
    private static final String FILE = "src\\com\\epam\\lab\\resources\\Observer";

    public void testObserver() {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("\nOutput:\nFirst state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

    @Override
    public void execute() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            boolean read = false;
            System.out.println("-----------Observer-----------");
            while ((line = br.readLine()) != null)
                System.out.println(line);
            testObserver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}