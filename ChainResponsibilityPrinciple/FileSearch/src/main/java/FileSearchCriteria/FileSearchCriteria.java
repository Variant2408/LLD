package FileSearchCriteria;

import java.io.File;
import java.util.List;

public interface FileSearchCriteria {
    List<File> meetCriteria(List<File> files);
}
