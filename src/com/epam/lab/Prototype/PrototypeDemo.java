package com.epam.lab.Prototype;

import com.epam.lab.Command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class PrototypeDemo implements Command {
    private static final String FILE = "src\\com\\epam\\lab\\resources\\Prototype.txt";
    private Employees emps;
    private Employees empsNew;

    public PrototypeDemo() {
        emps = new Employees();
        emps.loadData();
        empsNew = null;
    }

    private void testPrototype() throws CloneNotSupportedException {
        empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");
        System.out.println("Output:\nemps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }

    @Override
    public void execute() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            boolean read = false;
            System.out.println("-----------Prototype-----------");
            while ((line = br.readLine()) != null)
                System.out.println(line);
            testPrototype();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
