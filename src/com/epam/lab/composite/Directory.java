package com.epam.lab.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile {
    private List<AbstractFile> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        children.add(file);
    }

    public List<AbstractFile> getChildren() {
        return children;
    }

    public boolean isDirectory() {
        return true;
    }
}
