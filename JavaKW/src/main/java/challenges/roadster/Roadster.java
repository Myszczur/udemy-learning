package challenges.roadster;

public class Roadster {
    private float topSpeed;
    private float acceleration;
    private float crazyTopSpeed;
    private float crazyAcceleration;

    public Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        if (crazyMode) {
            return crazyTopSpeed;
        } else {
            return topSpeed;
        }
    }

    public float getAcceleration(boolean crazyMode) {
        if (crazyMode) {
            return crazyAcceleration;
        } else {
            return acceleration;
        }
    }
}

