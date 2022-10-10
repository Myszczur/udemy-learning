package challenges.files;

import java.io.*;

public class ObjectInputStreamSerialization {
    public static void main(String[] args)
            throws IOException {

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("files\\cars.dat")))) {
            while (true) {
                CarObject car = (CarObject) in.readObject();
                System.out.println(car);
            }
        } catch (EOFException e) {
            // koniec pliku
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
