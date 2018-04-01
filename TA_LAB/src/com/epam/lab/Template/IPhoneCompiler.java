package com.epam.lab.Template;

public class IPhoneCompiler extends CrossCompiler{
    protected void collectSource() {
        //anything specific to this class
        System.out.println("Iphone collectSource");
    }

    protected void compileToTarget() {
        //iphone specific compilation
        System.out.println("Iphone compileToTarget");
    }
}
