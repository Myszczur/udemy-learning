package challenges;


public class BmiChallenge {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.75f;

        float bmi = (float) (weight / Math.pow(height, 2));

        System.out.println(bmi);
        int bmiConverted = (int) bmi;
        System.out.println(bmiConverted);
    }
}