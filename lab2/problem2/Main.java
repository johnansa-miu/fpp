package problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter event name: ");
        String name = scanner.nextLine();

        System.out.print("Enter event date (yyyy-MM-dd): ");
        String date = scanner.nextLine();

        System.out.print("Enter event time (HH:mm): ");
        String time = scanner.nextLine();

        System.out.print("Enter event time zone (e.g. America/Chicago): ");
        String timeZone = scanner.nextLine();

        Event event = new Event(name, date, time, timeZone);

        System.out.println("Event Details:");
        System.out.println(event.formatEventDetails());
        System.out.println("Day of the week: " + event.getName());
        System.out.println("Day of the week: " + event.getDayOfWeek());
        System.out.println("Leap year: " + event.isLeapYear());
        System.out.println("Days until event: " + event.daysUntilEvent());

        System.out.print("Enter target time zone (e.g. Europe/London): ");
        String targetTimeZone = scanner.nextLine();

        System.out.println("Event time in target time zone:");
        System.out.println(event.convertTimeZone(targetTimeZone));

        scanner.close();
    }
}