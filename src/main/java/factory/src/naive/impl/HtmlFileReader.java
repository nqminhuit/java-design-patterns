package naive.impl;

import naive.service.FileReader;

public class HtmlFileReader implements FileReader {

    @Override
    public void readFile(String filename) {
        System.out.println("Using HtmlFileReader to read file: " + filename);
    }

}
