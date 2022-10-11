package challenges.files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args)
            throws IOException {

        FileReader fr = null;

        try {
            int num;

            fr = new FileReader("files\\fileWriterTest.txt");
            while ((num = fr.read()) != -1) {
                System.out.print((char) num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) fr.close();
        }

    }
}
