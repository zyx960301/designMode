package DecoratorPattern_zsz.ioDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        int c;
        LowerCaseInputStream in = null;
        try {
            in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) > 0){
                System.out.println((char)(c));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        in.close();
    }
}
