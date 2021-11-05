package day04;

public class PassengerMain {
    public static void main(String[] args) {
        Plane plane1 = new Plane(3);
        Passenger passenger1 = new Passenger("Béla", "12345", 2);
        Passenger passenger2 = new Passenger("Zoli", "22345", 3);
        Passenger passenger3 = new Passenger("Géza", "32345", 4);
        Passenger passenger4 = new Passenger("Joli", "42345", 5);
        Passenger passenger5 = new Passenger("Jani", "52345", 6);

        System.out.println(plane1.addPassenger(passenger1));
        System.out.println(plane1.addPassenger(passenger2));
        System.out.println(plane1.addPassenger(passenger3));
        System.out.println(plane1.addPassenger(passenger4));
        System.out.println(plane1.addPassenger(passenger5));
        System.out.println(plane1.numberOfPackages());
    }
}
