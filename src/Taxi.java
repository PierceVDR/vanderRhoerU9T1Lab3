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


    public void printInfo() {
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }

    @Override
    public double calculateCongestionPricing() {return 0.00;} // Taxis not subject to congestion pricing

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int customers = getPassengers()-1;
        fareCollected+=customers*farePerRider;
        return dropOffPassengers(customers);
    }

    private void applyTaxiDiscount() {
        if (getPassengers()>=4 && !isDiscountApplied()) {
            setDiscountApplied(true);
            setTollFee(getTollFee()*0.5);
        }
    }
}
