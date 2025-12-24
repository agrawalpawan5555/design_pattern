package com.demo;

public class FileMain {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Folder folder1 = new Folder("folder1");
        Folder root = new Folder("root");
        folder1.addFileSystem(file1);


        root.addFileSystem(folder1);
        root.addFileSystem(file2);
    }
}
