package challenges.files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args)
            throws IOException {

        try (FileInputStream in = new FileInputStream("test.txt")) {

            int num = 0;
            while ((num = in.read()) != -1) {
                System.out.print((char) num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
