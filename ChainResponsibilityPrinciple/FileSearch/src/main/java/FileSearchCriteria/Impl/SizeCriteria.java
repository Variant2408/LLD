package FileSearchCriteria.Impl;

import FileSearchCriteria.FileSearchCriteria;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SizeCriteria implements FileSearchCriteria {
    private long sizeThresold;
    private ComparisonType comparisonType;

    public enum ComparisonType{
        GREATER_THAN,LESSER_THAN,EXACT
    }
    public SizeCriteria(long size,ComparisonType comparisonType){
        this.sizeThresold=size;
        this.comparisonType=comparisonType;
    }

    @Override
    public List<File> meetCriteria(List<File> files) {
        List<File> filteredFiles=new ArrayList<>();
        for(File file: files){
            if(ComparisonType.GREATER_THAN==comparisonType && file.length()>sizeThresold)
                filteredFiles.add(file);
            if(ComparisonType.EXACT==comparisonType && file.length()==sizeThresold)
                filteredFiles.add(file);
            if(ComparisonType.LESSER_THAN==comparisonType && file.length()<sizeThresold)
                filteredFiles.add(file);
        }
        return filteredFiles;

    }
}
