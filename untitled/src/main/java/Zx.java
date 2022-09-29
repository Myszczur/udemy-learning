public class Zx {
    public static void main(String[] args) {
        String s = 8 + "12" + 4.0;
        System.out.println(s);

        Double[] array = {1.0, 5.0, 2.0, 3.0};
        Zx zx = new Zx();
        zx.dump(array);
        System.out.println("-------------------");
        A a = new A();

        System.out.println(a.x);
        System.out.println(a.x);

    }

    public <T> void dump(T[] table) {
        for (T t : table)
            System.out.println(t);
    }
}
