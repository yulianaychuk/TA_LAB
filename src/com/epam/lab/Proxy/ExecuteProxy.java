package com.epam.lab.Proxy;

import com.epam.lab.Command;

public class ExecuteProxy implements Command {
    @Override
    public void execute() {
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