public class CarDetails {
    private  String type;
    private String rideCharge;

    public String getType() {
        return type;
    }

    public String getRideCharge() {
        return rideCharge;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "type='" + type + '\'' +
                ", rideCharge='" + rideCharge + '\'' +
                '}';
    }

    public CarDetails(String type, String rideCharge) {
        this.type = type;
        this.rideCharge = rideCharge;
    }
    public CarDetails(){
        type="MG";
        rideCharge="10000";

    }
}
