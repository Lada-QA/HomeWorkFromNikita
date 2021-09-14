package Transport.java;

public class Ground extends Transport {
    int wheels;
    int fuelConsumption;

    public void Ground(int wheels, int fuelConsumption) {
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }

    void info() {
    }
}
