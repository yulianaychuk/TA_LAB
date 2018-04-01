package com.epam.lab;

import com.epam.lab.Decorator.Sing;
import com.epam.lab.Decorator.SingAnotherSong;
import com.epam.lab.Decorator.SingSong;
import com.epam.lab.Facade.Facade;
import com.epam.lab.Factory.FactoryMethod;
import com.epam.lab.Factory.Interviewer;
import com.epam.lab.Factory.Junior;
import com.epam.lab.Factory.Middle;
import com.epam.lab.Proxy.MainProxy;
import com.epam.lab.Proxy.OfficeInternetAccess;
import com.epam.lab.Proxy.ProxyInternetAccess;
import com.epam.lab.Template.AndroidCompiler;
import com.epam.lab.Template.CrossCompiler;
import com.epam.lab.Template.IPhoneCompiler;

import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello, User. This program have many pattern. Which pattern do you want see ?");
        System.out.println("1 - Factory Method \n" +
                "2 - Template Method \n" +
                "3 - Proxy Pattern \n" +
                "4 - Facade Pattern \n" +
                "5 - Decorator Pattern \n" +
                "Народ тут запишіть свій паттерн!");

        int counter = scanner.nextInt();

        switch (counter) {
            case 1:
                System.out.println("-------Factory Method--------- ");
                FactoryMethod factoryMethod = new FactoryMethod();
                Interviewer interviewer = factoryMethod.getInterviewer("Middle");
                interviewer.askQuestions();
                break;
            case 2:
                System.out.println("-------Template Method--------- ");
                CrossCompiler iphone = new IPhoneCompiler();
                iphone.crossCompile();
                CrossCompiler android = new AndroidCompiler();
                android.crossCompile();
                break;
            case 3:
                System.out.println("-------Proxy Pattern-------");
                System.out.println("There are banned sites abc.com, def.com,ijk.com,lnm.com");
                OfficeInternetAccess internet = new ProxyInternetAccess();
                try
                {
                    internet.connectTo("goverment.org");
                    internet.connectTo("abc.com");
                }
                catch (Exception e)
                {
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
                if (facadeInt == 1){
                    facade.switchOn();
                }
                if (facadeInt == 2){
                    facade.switchOff();
                }
                else {
                    System.out.println("You input incorrect value");
                }
                break;
            case 5:
                System.out.println("-------Decorator Pattern-------");
                SingSong singSong = new SingAnotherSong(new Sing());
                singSong.sing();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
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
        }
    }
}
