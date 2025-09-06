package problem3;

public record FlightBooking(String origin, String destination, double distanceKm) {
    public FlightBooking {
        if (origin == null || destination == null || distanceKm <= 0) {
            throw new IllegalArgumentException("Invalid Flight Booking details");
        }
    }
    public double computeFlightTime(double avgSpeed) {
        if (avgSpeed <= 0){
            throw new IllegalArgumentException("Average speed must be positive");
        }
        return distanceKm / avgSpeed;
    }
}