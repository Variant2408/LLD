package FileSearchCriteria.Impl;

import FileSearchCriteria.FileSearchCriteria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements FileSearchCriteria {
    private FileSearchCriteria firstCriteria;
    private FileSearchCriteria secondCriteria;

    public AndCriteria(FileSearchCriteria firstCriteria,FileSearchCriteria secondCriteria){
        this.firstCriteria=firstCriteria;
        this.secondCriteria=secondCriteria;
    }

    @Override
    public List<File> meetCriteria(List<File> files) {
        List<File> filteredFiles=firstCriteria.meetCriteria(files);
        List<File> filteredFiles2=secondCriteria.meetCriteria(filteredFiles);
        return filteredFiles2;

    }
}
