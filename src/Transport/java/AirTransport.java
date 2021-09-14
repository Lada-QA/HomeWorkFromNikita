package Transport.java;

public class AirTransport extends Transport {
    double wingspan;
    int minRunwayLength;


    void AirTransport(double wingspan, int minRunwayLength) {
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    void info() {
    }
}
