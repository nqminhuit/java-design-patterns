import java.util.Arrays;
import naive.FileReaderApplication;

public class App {

    public static void main(String[] args) {
        System.out.println();
        FileReaderApplication fileReaderApp = new FileReaderApplication();
        Arrays.stream(args).forEach(arg -> fileReaderApp.readFile(arg));
    }

}
