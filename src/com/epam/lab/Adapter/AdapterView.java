package com.epam.lab.Adapter;

public class AdapterView {
    public static void adapterView(){
        //Object adapter
        System.out.println("OBJECT ADAPTER");
        TypeCInterface adapter1 = new AdapterMicroTypeC1();
        adapter1.charge();
        adapter1.dataTransfer();
        //Class adapter
        System.out.println("CLASS ADAPTER");
        TypeCInterface adapter2 = new AdapterMicroTypeC2();
        adapter2.charge();
        adapter2.dataTransfer();
    }
}
