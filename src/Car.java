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

  @Override
  public double calculateTollPrice() {
    if (getPassengers()>=4) {
      return getTollFee()*4;
    } else {
      return super.calculateTollPrice();
    }
  }



  // Prints the:
  //    Car's license plate, toll fee, number of passengers, whether it is electric,
  //    and whether a discount has been applied.
  //    Add getter methods as necessary to the Vehicle superclass.
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Electric: " + electric);
    System.out.println("Discount Applied: " + discountApplied);
  }
}