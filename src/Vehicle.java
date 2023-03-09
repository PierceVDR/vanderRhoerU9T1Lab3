public class Vehicle {
  private String licensePlate;
  private double tollFee;
  private int passengers;

  public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public void setPassengers(int passengers) {this.passengers=passengers;}

  public void setTollFee(double tollFee) {this.tollFee=tollFee;}

  public String getLicensePlate() {return licensePlate;}

  public double getTollFee() {return tollFee;}

  public int getPassengers() {return passengers;}

  public double calculateTollPrice() {
    return tollFee * passengers;
  }

  public void printInfo() {
    System.out.println("License Plate: " + getLicensePlate());
    System.out.println("Toll Fee: " + getTollFee());
    System.out.println("Number of Passengers: " + getPassengers());
    System.out.println("Toll Price: " + calculateTollPrice());
    System.out.println("Congestion Pricing: " + calculateCongestionPricing());
  }

  public double calculateCongestionPricing() {return tollFee*0.5;}
}