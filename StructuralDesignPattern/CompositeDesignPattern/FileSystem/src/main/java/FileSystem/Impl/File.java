package FileSystem.Impl;

import FileSystem.FileSystemComponent;

public class File implements FileSystemComponent {
    String name;

    public File(String name){
        this.name=name;
    }

    @Override
    public void showDetails() {
        System.out.println("File Name: "+ this.name);
    }
}
