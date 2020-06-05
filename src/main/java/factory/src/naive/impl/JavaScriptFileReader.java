package naive.impl;

import naive.service.FileReader;

public class JavaScriptFileReader implements FileReader {

    @Override
    public void readFile(String filename) {
        System.out.println("Using JavaScriptFileReader to read file: " + filename);
    }

}
