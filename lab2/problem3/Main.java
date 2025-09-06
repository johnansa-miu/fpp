package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice  = "y";

        while (continueChoice .equalsIgnoreCase("y")) {
            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.println("Enter C for Car Rental");

            String choice = scanner.nextLine();

            switch (choice.toUpperCase()) {
                case "F" -> handleFlightBooking(scanner);
                case "H" -> handleHotelBooking(scanner);
                case "C" -> handleCarRental(scanner);
                default ->  System.out.println("Invalid option.");
            }

            System.out.print("Do you want to continue (y/n): ");
            continueChoice  = scanner.nextLine();
        }

        scanner.close();
    }

    private static void handleFlightBooking(Scanner scanner) {
        System.out.print("Enter origin: ");
        String origin = scanner.nextLine();

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        System.out.print("Enter distance in km: ");
        double distance = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter average speed (km/h): ");
        double avgSpeed = Double.parseDouble(scanner.nextLine());

        try {
            FlightBooking booking = new FlightBooking(origin, destination, distance);
            double flightTime = booking.computeFlightTime(avgSpeed);
            System.out.printf("Estimated Flight Time: %.2f hours%n", flightTime);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleHotelBooking(Scanner scanner) {
        System.out.print("Enter hotel name: ");
        String hotelName = scanner.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter price per night: ");
        double price = Double.parseDouble(scanner.nextLine());

        try {
            HotelBooking booking = new HotelBooking(hotelName, nights, price);
            double totalCost = booking.totalCost();
            System.out.printf("Total Hotel Cost: %.2f%n", totalCost);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void handleCarRental(Scanner scanner) {
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();

        System.out.print("Enter number of days: ");
        int days = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter rate per day: ");
        double rate = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter miles per day: ");
        double miles = Double.parseDouble(scanner.nextLine());

        try {
            CarRental rental = new CarRental(carModel, days, rate, miles);
            double totalCost = rental.totalRentalCost();
            double totalMiles = rental.totalMilesAllowed();
            System.out.printf("Total Rental Cost: %.2f%n", totalCost);
            System.out.printf("Total Miles Allowed: %.2f%n", totalMiles);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}