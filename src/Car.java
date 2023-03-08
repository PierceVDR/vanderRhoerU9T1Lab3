public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void setDiscountApplied(boolean discountApplied) {this.discountApplied=discountApplied;}

  public boolean isElectric() {return electric;}

  public boolean isDiscountApplied() {return discountApplied;}

  public boolean dropOffPassengers(int numOut) {
    if (numOut>=getPassengers()) {
      return false;
    } else {
      setPassengers(getPassengers()-numOut);
      return true;
    }
  }

  public void applyDiscount() {
    if (electric && !discountApplied) {
      discountApplied=true;
      setTollFee(getTollFee()*0.5);
    }
  }


  // Prints the:
  //    Car's license plate, toll fee, number of passengers, whether it is electric,
  //    and whether a discount has been applied.
  //    Add getter methods as necessary to the Vehicle superclass.
  public void printCar() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Number of Passengers: " + getPassengers());
    System.out.println("Electric: " + electric);
    System.out.println("Discount Applied: " + discountApplied);
  }
}