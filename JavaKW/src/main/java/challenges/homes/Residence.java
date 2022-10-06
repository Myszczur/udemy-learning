package challenges.homes;

public class Residence extends House {
    protected float garageSize;

    public Residence(String city, String street, float parcelSize, float garageSize) {
        super(city, street, parcelSize);
        this.setGarageSize(garageSize);
    }

    public float getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(float garageSize) {
        this.garageSize = garageSize;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "garageSize=" + garageSize +
                ", parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}