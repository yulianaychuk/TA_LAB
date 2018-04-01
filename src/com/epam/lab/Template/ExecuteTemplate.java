package com.epam.lab.Template;

import com.epam.lab.Command;

public class ExecuteTemplate implements Command {
    @Override
    public void execute() {
        System.out.println("-------Template Method--------- ");
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }
}
