package Transport.java;

public abstract class Transport {
    int power;
    int weight;
    int maxSpeed;
    String mark;

    public void Transport(int power, int maxSpeed, String mark, int weight) {
        this.power = power;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
    }

    abstract void info();
}

