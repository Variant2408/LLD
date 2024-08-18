package FileSearcher;

import FileSearchCriteria.FileSearchCriteria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {
    private List<FileSearchCriteria> criteriaList=new ArrayList<>();

    public void addFileSearchCriteria(FileSearchCriteria criteria){
        criteriaList.add(criteria);
    }

    public List<File> search(File directory){
        System.out.println(directory.getAbsolutePath());
        List<File> files=listFiles(directory);
        for(FileSearchCriteria criteria: criteriaList){
            files=criteria.meetCriteria(files);
        }
        return files;
    }

    public List<File> listFiles(File directory){
        List<File> fileList=new ArrayList<>();
        File[] files=directory.listFiles();
        if(files!=null){
            for(File file: files){
                if(file.isDirectory()){
                    fileList.addAll(listFiles(file));
                }
                else{
                    System.out.println("fileNAmeKK: "+file.getName());
                    fileList.add(file);
                }
            }
        }
        return fileList;
    }
}
