package challenges.lambdas;


import java.util.function.IntSupplier;

public class MethodReference {
    public static void main(String args[]) {

        Object obj = new Object();
        // interfejs funkcyjny oraz wyłuskanie metody hashCode
        IntSupplier intSupplier = obj::hashCode;

        // wywołanie hashCode w innym miejscu
        int hash = intSupplier.getAsInt();
        System.out.println(hash); // np 1134712904

        System.out.println(hash == obj.hashCode()); // true

    }
}
