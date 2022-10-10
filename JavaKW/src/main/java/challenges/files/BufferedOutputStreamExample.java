package challenges.files;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args)
            throws IOException {

        BufferedOutputStream out = null;
        String str = "Testowy string.";
        char[] chars = str.toCharArray();

        try {
            out = new BufferedOutputStream(
                    new FileOutputStream("files\\test.txt"));

            for (char c : chars) {
                out.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) out.close();
        }

    }

}
