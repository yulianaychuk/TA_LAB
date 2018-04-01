package com.epam.lab.Decorator;

public abstract class SingDecorator implements SingSong {

    private SingSong singDecorator;
    public SingDecorator(SingSong singDecorator) {
        this.singDecorator = singDecorator;
    }
    public SingSong getSingDecorator() {
        return singDecorator;
    }
    @Override
    public void sing() {
        singDecorator.sing();
    }

}
