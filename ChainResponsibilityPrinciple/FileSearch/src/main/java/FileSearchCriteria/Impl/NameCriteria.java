package FileSearchCriteria.Impl;

import FileSearchCriteria.FileSearchCriteria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NameCriteria implements FileSearchCriteria {
    String name;

    public NameCriteria(String name){
        this.name=name;
    }
    @Override
    public List<File> meetCriteria(List<File> files) {
        List<File> filteredFiles=new ArrayList<>();
        for(File file: files){
            if(file.getName().contains(name))
                filteredFiles.add(file);
        }
        return filteredFiles;
    }
}
