package org.example;

import FileSystem.FileSystemComponent;
import FileSystem.Impl.Directory;
import FileSystem.Impl.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Directory component1=new Directory("Coding Book");
        FileSystemComponent file1=new File("java.txt");
        FileSystemComponent file2=new File("python.txt");
        component1.addComponent(file1);
        component1.addComponent(file2);


        Directory component2=new Directory("Study");
        component2.addComponent(new File("RD Sharma"));
        component2.addComponent(new File("HC VERMA"));

        component1.addComponent(component2);
        component1.showDetails();




    }
}