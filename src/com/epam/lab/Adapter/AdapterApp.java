package com.epam.lab.Adapter;

interface TypeCInterface {
    void charge();

    void dataTransfer();
}

class MicroUsb {
    void microUsbCharge() {
        System.out.println("Charging");
    }

    void microUsbDataTransfer() {
        System.out.println("Data transfer");
    }
}

class AdapterMicroTypeC1 extends MicroUsb implements TypeCInterface {

    @Override
    public void charge() {
        microUsbCharge();
    }

    @Override
    public void dataTransfer() {
        microUsbDataTransfer();
    }
}

class AdapterMicroTypeC2 implements TypeCInterface {
    MicroUsb phone = new MicroUsb();

    @Override
    public void charge() {
        phone.microUsbCharge();
    }

    @Override
    public void dataTransfer() {
        phone.microUsbDataTransfer();
    }
}
