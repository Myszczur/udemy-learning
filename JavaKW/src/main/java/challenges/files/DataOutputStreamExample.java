package challenges.files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args)
            throws IOException {

        try (DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("files\\test.dat")))) {

            out.writeUTF("Testowy strumień binarny");
            out.writeShort(32000);
            out.writeLong(12316523416221L);
            out.writeFloat(23.56f);
            out.writeDouble(237465.434d);
            out.writeByte(12);
            out.writeChar('A');

            out.flush(); // wymuszenie zapisu z bufora

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
