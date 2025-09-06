package problem3;

public class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final double milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay) {
        if (carModel == null || carModel.isBlank())
            throw new IllegalArgumentException("Car model cannot be empty");
        if (days <= 0)
            throw new IllegalArgumentException("Days must be positive");
        if (ratePerDay <= 0)
            throw new IllegalArgumentException("Rate per day must be positive");
        if (milesPerDay <= 0)
            throw new IllegalArgumentException("Miles per day must be positive");

        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost() {
        return days * ratePerDay;
    }

    public double totalMilesAllowed() {
        return days * milesPerDay;
    }
}
