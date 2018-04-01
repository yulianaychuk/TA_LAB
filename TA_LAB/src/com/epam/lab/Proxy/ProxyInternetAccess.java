package com.epam.lab.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private OfficeInternetAccess internet = new RealInternetAccess();
    private static List<String> bannedSites;
    public ProxyInternetAccess()
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied for "+serverhost);
        }
        internet.connectTo(serverhost);
    }
}

