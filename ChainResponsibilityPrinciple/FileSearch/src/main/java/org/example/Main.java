package org.example;

import FileSearchCriteria.FileSearchCriteria;
import FileSearchCriteria.Impl.AndCriteria;
import FileSearchCriteria.Impl.ExtensionCriteria;
import FileSearchCriteria.Impl.NameCriteria;
import FileSearchCriteria.Impl.SizeCriteria;
import FileSearcher.FileSearcher;

import java.io.File;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        FileSearcher fileSearcher=new FileSearcher();
        fileSearcher.addFileSearchCriteria(new ExtensionCriteria(".txt"));
        fileSearcher.addFileSearchCriteria(new NameCriteria("example"));
        fileSearcher.addFileSearchCriteria(new SizeCriteria(1024, SizeCriteria.ComparisonType.GREATER_THAN));

        List<File> resultFiles=fileSearcher.search(new File("path/to/search.txt"));

        for(File file:resultFiles){
            System.out.println("Found File :"+file.getName());
        }

    }
}