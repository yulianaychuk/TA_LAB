package com.epam.lab.composite;

import java.util.List;

public abstract class AbstractFile {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract boolean isDirectory();

    public abstract List<AbstractFile> getChildren();
}
