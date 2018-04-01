package com.epam.lab.Decorator;

public class SingAnotherSong extends SingDecorator {

    public SingAnotherSong(SingSong singDecorator) {
        super(singDecorator);
    }
    @Override
    public void sing() {
        System.out.print("&");
        super.sing();
        System.out.print("&");
    }

}
