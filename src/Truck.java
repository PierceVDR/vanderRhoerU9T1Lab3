public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate() {
    if (!hasTrailer) {
      return true;
    } else { // Has a trailer...
      String suffix = getLicensePlate().substring(getLicensePlate().length()-2);

      if (axles > 4) {
        return suffix.equals("MX");
      } else { // axles<=4
        return suffix.equals("LX");
      }
    }
  }

  @Override
  public double calculateTollPrice() {
    double price=getTollFee() * axles;
    if (hasTrailer) {price*=2;}
    return price;
  }

  // Prints the:
  //    Truck's license plate, toll fee, number of passengers, number of axles,
  //    and whether it has a trailer.
  //    Add getter methods as necessary to the Vehicle superclass.
  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Number of Axles: " + axles);
    System.out.println("Has a Trailer: " + hasTrailer);
  }
}