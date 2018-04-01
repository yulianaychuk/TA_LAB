package com.epam.lab.Template;

public class AndroidCompiler extends CrossCompiler{
    protected void collectSource() {
        //anything specific to this class
        System.out.println("Android collectSource");
    }

    protected void compileToTarget() {
        //android specific compilation
        System.out.println("Android compileToTarget");
    }
}
