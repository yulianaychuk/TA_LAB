package com.epam.lab.Proxy;

public class RealInternetAccess implements OfficeInternetAccess {
    public void connectTo(String serverhost)
    {
        System.out.println("Connecting to "+ serverhost);
    }
}
