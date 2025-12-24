package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {

    String   name;
    private List<FileSystem> fileSystems= new ArrayList<>();
    public Folder(String name){
        this.name = name;
    }


    @Override
    public void showDetails() {
        System.out.println(name);
    }

    public void addFileSystem(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
    public void removeFileSystem(FileSystem fileSystem){
        fileSystems.remove(fileSystem);
    }
}
