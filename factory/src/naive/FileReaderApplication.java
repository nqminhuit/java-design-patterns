package naive;

import naive.impl.CssFileReader;
import naive.impl.HtmlFileReader;
import naive.impl.JavaFileReader;
import naive.impl.JavaScriptFileReader;

public class FileReaderApplication {

    private JavaFileReader javaFileReader = new JavaFileReader();

    private JavaScriptFileReader jsFileReader = new JavaScriptFileReader();

    private HtmlFileReader htmlFileReader = new HtmlFileReader();

    private CssFileReader cssFileReader = new CssFileReader();

    public void readFile(String filename) {
        if (filename.endsWith(".java")) {
            javaFileReader.readFile(filename);
        }
        else if (filename.endsWith(".js")) {
            jsFileReader.readFile(filename);
        }
        else if (filename.endsWith(".html")) {
            htmlFileReader.readFile(filename);
        }
        else if (filename.endsWith(".css")) {
            cssFileReader.readFile(filename);
        }
        else {
            System.out.println("### Exception: extension is not supported for file: " + filename);
        }
    }

}
