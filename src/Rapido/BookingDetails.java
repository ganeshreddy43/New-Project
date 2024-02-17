package Rapido;

public class BookingDetails {

    public String auto;
    public String bike;
    private  int noOfPersoan;
    public CarDetails car;

    public BookingDetails(String auto, String bike, int noOfPersoan, CarDetails car) {
        this.auto = auto;
        this.bike = bike;
        this.noOfPersoan = noOfPersoan;
        this.car = car;
    }

    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public int getNoOfPersoan() {
        return noOfPersoan;
    }

    public CarDetails getCar() {
        return car;
    }
}
