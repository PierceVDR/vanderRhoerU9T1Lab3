public class Taxi extends Car {
    double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected=fareCollected;
    }

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected=0; // Default value
    }

    public double getFareCollected() {return fareCollected;}
    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers()+numRiders);
        fareCollected+=numRiders*farePerRider;
        applyTaxiDiscount(); // Helper method which, if applicable, applies discount
    }


    public void printTaxi() {
        printCar();
        System.out.println("Fare Collected: " + fareCollected);
    }

    private void applyTaxiDiscount() {
        if (getPassengers()>=4 && !isDiscountApplied()) {
            setDiscountApplied(true);
            setTollFee(getTollFee()*0.5);
        }
    }
}
