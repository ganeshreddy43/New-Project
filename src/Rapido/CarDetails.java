package Rapido;

public class CarDetails {

    private String type;
    public String rideCharge;

    public CarDetails(String type, String rideCharge) {
        this.type = type;
        this.rideCharge = rideCharge;

    }

    public String getType() {
        return type;
    }

    public String getRideCharge() {
        return rideCharge;
    }
}
