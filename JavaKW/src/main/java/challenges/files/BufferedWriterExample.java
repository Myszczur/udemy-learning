package challenges.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args)
            throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files\\multiline.txt"))) {

            for (int i = 0; i < 5; i++) {
                bw.write("Testowy łańcuch znaków: " + i + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
