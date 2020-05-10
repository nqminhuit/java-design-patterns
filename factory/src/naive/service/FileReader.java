package naive.service;

import java.nio.file.FileSystemException;

public interface FileReader {

    public void readFile(String filename) throws FileSystemException;

}
