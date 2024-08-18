package FileSearchCriteria.Impl;

import FileSearchCriteria.FileSearchCriteria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ExtensionCriteria implements FileSearchCriteria {
    private String extension;

    public ExtensionCriteria(String extension){
        this.extension=extension;
    }

    @Override
    public List<File> meetCriteria(List<File> files) {
        System.out.println("Extension: "+extension);
        List<File> filteredFile=new ArrayList<>();
        for(File file: files){
            System.out.println("FileName: "+file.getName());
            if(file.getName().endsWith(extension))
                filteredFile.add(file);
        }
        return filteredFile;
    }
}
