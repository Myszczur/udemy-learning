package challenges.abstract_calsses;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Kamil","Urbanik", "Java, JavaScript, TypeScript, SQL, COBOL");

        String str = programmer.toString();
        System.out.println(str);
    }
}
