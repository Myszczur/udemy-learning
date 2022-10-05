package challenges.tv;

public class Tv {
    String manufacturer;
    String model;
    int year;
    String uniqueId;
    float numInches;
    float weight;
    String color;
    String maxResolution; // 4k, 1080p

    public void printBasicData() {
        System.out.println(
                this.manufacturer +
                        " " + this.model +
                        " " + this.year
        );
    }
}