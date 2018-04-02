package com.epam.lab.composite;

import com.epam.lab.Command;

import java.util.List;

public class CompositeCommand implements Command {

    private void showDir(int indent, AbstractFile file) {
        for (int i = 0; i < indent; i++) System.out.print("  ");
        System.out.println(file.getName());
        if (file.isDirectory()) {
            List<AbstractFile> abstractFiles = file.getChildren();
            for (AbstractFile file1 : abstractFiles) {
                showDir(indent + 2, file1);
            }
        }

    }

    private void showDir(AbstractFile file) {
        showDir(0, file);
    }

    @Override
    public void execute() {
        Directory rootDir = new Directory("RootDirectory");
        File file1 = new File("FirstFile.txt");
        Directory dir = new Directory("Directory");
        rootDir.add(file1);
        rootDir.add(dir);
        dir.add(new File("InternalFile1"));
        dir.add(new File("InternalFile2"));

        showDir(rootDir);
    }
}
