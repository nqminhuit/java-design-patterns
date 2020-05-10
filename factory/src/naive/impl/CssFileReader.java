package naive.impl;

import naive.service.FileReader;

public class CssFileReader implements FileReader {

    @Override
    public void readFile(String filename) {
        System.out.println("Using CssFileReader to read file: " + filename);
    }

}
