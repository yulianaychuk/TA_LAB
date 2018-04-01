package com.epam.lab;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.epam.lab.Adapter.AdapterView;
import com.epam.lab.chainOfResponsibility.ChainOfResponsibilityDemo;
import com.epam.lab.Decorator.Sing;
import com.epam.lab.Decorator.SingAnotherSong;
import com.epam.lab.Decorator.SingSong;
import com.epam.lab.Facade.Facade;
import com.epam.lab.Factory.ExecuteFactory;
import com.epam.lab.Observer.ObserverDemo;
import com.epam.lab.Prototype.PrototypeDemo;
import com.epam.lab.Proxy.OfficeInternetAccess;
import com.epam.lab.Proxy.ProxyInternetAccess;
import com.epam.lab.Template.ExecuteTemplate;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello, User. This program have many pattern. Which pattern do you want see ?");
        System.out.println("1 - Factory Method \n" +
                "2 - Template Method \n" +
                "3 - Proxy Pattern \n" +
                "4 - Facade Pattern \n" +
                "5 - Decorator Pattern \n" +
                "6 - Prototype Pattern \n" +
                "7 - Observer Pattern \n" +
                "8 - Adapter Pattern \n" +
                "9 - Chain of Responsibility Pattern \n" +
                "Народ тут запишіть свій паттерн!");

        try {
            int counter = scanner.nextInt();
        switch (counter) {
            case 1:
                ExecuteFactory executeFactory = new ExecuteFactory();
                executeFactory.execute();
                break;
            case 2:
                ExecuteTemplate executeTemplate = new ExecuteTemplate();
                executeTemplate.execute();
            case 3:
                System.out.println("-------Proxy Pattern-------");
                System.out.println("There are banned sites abc.com, def.com,ijk.com,lnm.com");
                OfficeInternetAccess internet = new ProxyInternetAccess();
                try {
                    internet.connectTo("goverment.org");
                    internet.connectTo("abc.com");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                System.out.println("-------Facade Pattern-------");
                Facade facade = new Facade();
                Scanner facadeScanner = new Scanner(System.in);
                System.out.println("1 - Computer on \n" +
                        "2 - Computer off");
                int facadeInt = facadeScanner.nextInt();
                if (facadeInt == 1) {
                    facade.switchOn();
                }
                if (facadeInt == 2) {
                    facade.switchOff();
                } else {
                    System.out.println("You input incorrect value");
                }
                break;
            case 5:
                System.out.println("-------Decorator Pattern-------");
                SingSong singSong = new SingAnotherSong(new Sing());
                singSong.sing();
                break;
            case 6:
                PrototypeDemo prototype = new PrototypeDemo();
                prototype.execute();
                break;
            case 7:
                ObserverDemo observer = new ObserverDemo();
                observer.execute();
                break;
            case 8:
                System.out.println("-------Adapter Pattern-------");
                AdapterView.adapterView();
                break;
            case 9:
                System.out.println("-------Chain of Responsibility Pattern-------");
                ChainOfResponsibilityDemo.main(args);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                throw new InputMismatchException();
        }
        }catch(InputMismatchException e){
            System.out.println("Wrong input. There is no such pattern(");
        }
    }
}
