package lab4.problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor {
    private final double temperature;
    private final String location;
    private LocalTime lastUpdated;

    public TemperatureSensor(double temperature, String location) {
        this.temperature = temperature;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return temperature;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public LocalTime getLastUpdated() {
        lastUpdated = LocalTime.now();
        return lastUpdated;
    }

    @Override
    public String performAction() {
        if (temperature > 30) {
            return "An alert to turn on the AC";
        } else if (temperature < 18) {
            return "An alert to turn on the Heater";
        } else {
            return " Temperature is in normal range";
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated().format(formatter) + "\n" +
                "Action: " + performAction();
    }
}
