public class VehicleRunner {
  public static void main(String[] args) {
//    // -------------- LAB PART 1 -----------------
//    // a. write code to create a Vehicle object with license "MC56WQ",
//    //    toll fee of 10.75, and 5 passengers.
//    //    Print out the calculated toll TollPrice.
//    Vehicle myVehicle = new Vehicle("MC56WQ",10.75,5);
//    System.out.println(myVehicle.calculateTollPrice());
//
//
//    System.out.print("\n");
//    // b. write code to create an electric Car with license "KXN73F",
//    //    toll fee of 8.50, and 2 passengers.
//    //    Print out the calculated toll price
//    Car myCar = new Car("KXN73F",8.50, 2, true);
//    System.out.println(myCar.calculateTollPrice());
//
//
//    System.out.print("\n");
//    // c. add a printCar() void method to the Car class that prints the
//    //    Car's license plate, toll fee, number of passengers, whether it is electric,
//    //    and whether a discount has been applied.
//    //    Add getter methods as necessary to the Vehicle superclass.
//    //
//    // d. call the method on the Car you made in b to test it.
//    myCar.printCar();
//
//
//    System.out.print("\n");
//    // e. write code to create a Truck with license "3K9JMX",
//    //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
//    //    Print out the calculated toll price
//    Truck myTruck = new Truck("3K9JMX", 24.75, 4, 6, true);
//    System.out.println(myTruck.calculateTollPrice());
//
//
//    System.out.print("\n");
//    // f. add a printTruck() void method to the Truck class that prints the
//    //    Truck's license plate, toll fee, number of passengers, number of axles,
//    //    and whether it has a trailer.
//    //    Add getter methods as necessary to the Vehicle superclass.
//    //
//    // g. call the method on the Truck you made in e to test it.
//    myTruck.printTruck();
//
//    System.out.println("---------------");
//    // ------------ LAB PART 2 ---------------
//    // ----- instructions in lab sheet -------
//    Taxi myTaxi = new Taxi("8KM23Z", 9.25, 3, true, 5.00);
//    myTaxi.printTaxi();
//
//
//    System.out.print("\n");
//
//
//    System.out.println(myTaxi.getLicensePlate());
//    System.out.println(myTaxi.getTollFee());
//    System.out.println(myTaxi.getPassengers());
//    System.out.println(myTaxi.calculateTollPrice());
//
//    System.out.println(myTaxi.isElectric());
//    System.out.println(myTaxi.isDiscountApplied());
//
//    myTaxi.printTaxi();
//
//
//    System.out.print("\n");
//
//
//    System.out.println(myTaxi instanceof Taxi);
//    System.out.println(myTaxi instanceof Car);
//    System.out.println(myTaxi instanceof Vehicle);
//
//
//
//
//    System.out.println("\n\n\n---------------");
//    // ------------ LAB PART 3 ---------------
//    // ----- instructions in lab sheet -------
//    System.out.println("--- Testing method on a Car object ---");
//    Car testCar1 = new Car("KXN73F", 8.50, 5, true);
//    System.out.println(testCar1.getPassengers());
//    System.out.println("-----------");
//    boolean success = testCar1.dropOffPassengers(3);
//    System.out.println(success);
//    System.out.println(testCar1.getPassengers());
//    System.out.println("-----------");
//    success = testCar1.dropOffPassengers(3);
//    System.out.println(success);
//    System.out.println(testCar1.getPassengers());
//    System.out.println("--- Testing method on a Taxi object ---");
//    Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
//    System.out.println(testTaxi1.getPassengers());
//    System.out.println("-----------");
//    success = testTaxi1.dropOffPassengers(3);
//    System.out.println(success);
//    System.out.println(testTaxi1.getPassengers());
//    System.out.println("-----------");
//    success = testTaxi1.dropOffPassengers(2);
//    System.out.println(success);
//    System.out.println(testTaxi1.getPassengers());
//    System.out.println("-----------");
//
//    System.out.print("\n");
//
//    System.out.println("--- Testing method on a Car object ---");
//    //Car testCar1 = new Car("KXN73F", 8.50, 5, true);
//    testCar1.applyDiscount();
//    System.out.println(testCar1.isDiscountApplied());
//    System.out.println(testCar1.getTollFee());
//    System.out.println("-----------");
//    testCar1.applyDiscount(); // try applying again
//    System.out.println(testCar1.isDiscountApplied());
//    System.out.println(testCar1.getTollFee());
//    System.out.println("--- Testing method on Taxi objects ---");
//    Taxi testTaxi2 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
//    testTaxi2.applyDiscount();
//    System.out.println(testTaxi2.isDiscountApplied());
//    System.out.println(testTaxi2.getTollFee());
//    System.out.println("-----------");
//    Taxi testTaxi3 = new Taxi("ABC645", 12.0, 3, true, 5.0);
//    testTaxi3.applyDiscount();
//    System.out.println(testTaxi3.isDiscountApplied());
//    System.out.println(testTaxi3.getTollFee());
//    System.out.println("-----------");
//
//    System.out.print("\n");
//
//    System.out.println("--- Testing method on Truck objects ---");
//    Truck testTruck1 = new Truck("7645MX", 10.50, 3, 7, true);
//    boolean validLicensePlate = testTruck1.validateLicensePlate();
//    System.out.println(validLicensePlate);
//    System.out.println("-----------");
//    Truck testTruck2 = new Truck("7645PX", 10.50, 3, 7, true);
//    validLicensePlate = testTruck2.validateLicensePlate();
//    System.out.println(validLicensePlate);
//    System.out.println("-----------");
//    Truck testTruck3 = new Truck("7645LX", 10.50, 3, 4, true);
//    validLicensePlate = testTruck3.validateLicensePlate();
//    System.out.println(validLicensePlate);
//    System.out.println("-----------");
//    Truck testTruck4 = new Truck("7645L9", 10.50, 3, 4, true);
//    validLicensePlate = testTruck4.validateLicensePlate();
//    System.out.println(validLicensePlate);
//    System.out.println("-----------");
//    Truck testTruck5 = new Truck("7645L9", 10.50, 3, 4, false);
//    validLicensePlate = testTruck5.validateLicensePlate();
//    System.out.println(validLicensePlate);
//    System.out.println("-----------");
//    Truck testTruck6 = new Truck("7645PX", 10.50, 3, 7, false);
//    validLicensePlate = testTruck6.validateLicensePlate();
//    System.out.println(validLicensePlate);
//
//
//    System.out.print("\n");
//    System.out.print("\n");
//
//
//    System.out.println("--------- TEST 1 ---------");
//    System.out.println("---- non-electric Taxi ---");
//    System.out.println("--------------------------");
//    Taxi testTaxi5 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
//    testTaxi5.applyDiscount();
//    System.out.println("discount already applied? " + testTaxi5.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi5.getTollFee());
//    System.out.println("total fare collected: " + testTaxi5.getFareCollected());
//    System.out.println("total passengers: " + testTaxi5.getPassengers());
//    testTaxi5.pickupRiders(2, 3.75);
//    System.out.println("-----------");
//    System.out.println("discount already applied? " + testTaxi5.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi5.getTollFee());
//    System.out.println("total fare collected: " + testTaxi5.getFareCollected());
//    System.out.println("total passengers: " + testTaxi5.getPassengers());
//    testTaxi5.pickupRiders(2, 5.90);
//    System.out.println("-----------");
//    System.out.println("discount already applied? " + testTaxi5.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi5.getTollFee());
//    System.out.println("total fare collected: " + testTaxi5.getFareCollected());
//    System.out.println("total passengers: " + testTaxi5.getPassengers());
//    testTaxi5.pickupRiders(3, 3.40);
//    System.out.println("-----------");
//    System.out.println("discount already applied? " + testTaxi5.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi5.getTollFee());
//    System.out.println("total fare collected: " + testTaxi5.getFareCollected());
//    System.out.println("total passengers: " + testTaxi5.getPassengers());
//
//    System.out.println("\n--------- TEST 2 ---------");
//    System.out.println("----- electric Taxi ------");
//    System.out.println("--------------------------");
//    Taxi testTaxi6 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
//    testTaxi6.applyDiscount();
//    System.out.println("discount already applied? " + testTaxi6.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi6.getTollFee());
//    System.out.println("total fare collected: " + testTaxi6.getFareCollected());
//    System.out.println("total passengers: " + testTaxi6.getPassengers());
//    testTaxi6.pickupRiders(2, 3.7);
//    System.out.println("-----------");
//    System.out.println("discount already applied? " + testTaxi6.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi6.getTollFee());
//    System.out.println("total fare collected: " + testTaxi6.getFareCollected());
//    System.out.println("total passengers: " + testTaxi6.getPassengers());
//    testTaxi6.pickupRiders(2, 4.75);
//    System.out.println("-----------");
//    System.out.println("discount already applied? " + testTaxi6.isDiscountApplied());
//    System.out.println("toll fee: " + testTaxi6.getTollFee());
//    System.out.println("total fare collected: " + testTaxi6.getFareCollected());
//    System.out.println("total passengers: " + testTaxi6.getPassengers());





    Car myCar = new Car("MK4567", 10.0, 3, true);
    System.out.println(myCar.calculateTollPrice());

    Car myCar2 = new Car("FJ8731", 10.0, 6, true);
    System.out.println(myCar2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
    System.out.println(myVehicle.calculateTollPrice());


    System.out.println("\n");


    Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
    System.out.println(myTruck.calculateTollPrice());

    Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
    System.out.println(myTruck2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
    System.out.println(myVehicle2.calculateTollPrice());


    System.out.println("\n");


    Taxi myTaxi = new Taxi("ABCDEF", 10, 5, false);
    System.out.println(myTaxi.calculateTollPrice());


    System.out.println("\n");


    Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
    System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

    // now let's drop off the 5 riders, charging 3.50 per rider
    boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
    System.out.println(success); // should be true
    System.out.println(myTaxi3.getPassengers()); // should now be 1
    System.out.println(myTaxi3.getFareCollected()); // should be 17.50


    System.out.println("\n");


    Vehicle myVehicle3 = new Vehicle("BB8123", 7.0, 3);
    myVehicle3.printInfo();

    System.out.println();

    Car myCar3 = new Car("MK4567", 6.75, 4, true);
    myCar3.printInfo();

    System.out.println();

    Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
    myTruck3.printInfo();

    System.out.println();

    Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
    myTaxi4.printInfo();


    System.out.println("\n");

    Vehicle vehicleTest = new Vehicle("VEHICL", 20, 30);
    System.out.println(vehicleTest.calculateCongestionPricing());

    Car carTest = new Car("CARCAR", 20, 2, false);
    System.out.println(carTest.calculateCongestionPricing());

    Truck truckTest = new Truck("TRUUCK", 20, 2, 2,false);
    System.out.println(truckTest.calculateCongestionPricing());

    Taxi taxiTest = new Taxi("TAAXII", 20, 2, false,0.00);
    System.out.println(taxiTest.calculateCongestionPricing());
  }
}