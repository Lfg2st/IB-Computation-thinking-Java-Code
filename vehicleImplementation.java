import java.util.Scanner;
import packages.vehicle;
public class vehicleImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input vehicle details
        System.out.println("Enter vehicle details:");
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        // Create Vehicle object
        vehicle vehicle = new vehicle(make, model, year, price);

        // Display vehicle details
        System.out.println("\nVehicle Details:");
        vehicle.displayDetails();

        scanner.close();
    }
}