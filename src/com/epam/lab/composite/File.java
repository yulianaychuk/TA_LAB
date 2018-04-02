package com.epam.lab.composite;

import java.util.List;

public class File extends AbstractFile {

    public File(String name) {
        this.name = name;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public List<AbstractFile> getChildren() {
        return null;
    }
}
