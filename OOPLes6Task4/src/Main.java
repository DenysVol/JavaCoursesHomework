import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        File fl = new File(".");
        try {
            FileInputStream fis = new FileInputStream(fl);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
