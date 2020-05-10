package naive.impl;

import naive.service.FileReader;

public class JavaFileReader implements FileReader {

    @Override
    public void readFile(String filename) {
        System.out.println("Using JavaFileReader to read file: " + filename);
    }

}
