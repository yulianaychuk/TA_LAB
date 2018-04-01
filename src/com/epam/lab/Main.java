package com.epam.lab;

import com.epam.lab.Factory.FactoryMethod;
import com.epam.lab.Factory.Interviewer;
import com.epam.lab.Factory.Junior;
import com.epam.lab.Factory.Middle;
import com.epam.lab.Proxy.OfficeInternetAccess;
import com.epam.lab.Proxy.ProxyInternetAccess;
import com.epam.lab.Template.AndroidCompiler;
import com.epam.lab.Template.CrossCompiler;
import com.epam.lab.Template.IPhoneCompiler;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------Factory Method--------- ");
        FactoryMethod factoryMethod = new FactoryMethod();
        Interviewer interviewer = factoryMethod.getInterviewer("Middle");
        interviewer.askQuestions();

        System.out.println("-------Template Method--------- ");
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();

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
    }
}
