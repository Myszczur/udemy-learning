package challenges.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamCopyFile {
    public static void main(String[] args)
            throws IOException {

        try (FileInputStream in = new FileInputStream("test.txt"); FileOutputStream out = new FileOutputStream("copy.txt")) {

            int num = 0;
            while ((num = in.read()) != -1) {
                out.write(num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
