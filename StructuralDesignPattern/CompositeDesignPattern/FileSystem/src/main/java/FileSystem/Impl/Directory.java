package FileSystem.Impl;

import FileSystem.FileSystemComponent;

import java.util.ArrayList;
import java.util.*;

public class Directory implements FileSystemComponent {
    String name;
    List<FileSystemComponent> components=new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }

    @Override
    public void showDetails() {
        for(FileSystemComponent ob: this.components){
            ob.showDetails();
        }
    }
}
