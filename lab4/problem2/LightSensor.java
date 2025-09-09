package lab4.problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor {
    private final double lightLevel;
    private final String location;
    private LocalTime lastUpdated;

    public LightSensor(double lightLevel, String location) {
        this.lightLevel = lightLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return lightLevel;
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
        if (lightLevel < 100) {
            return "An alert to turn on the light";
        } else {
            return " Light is sufficient";
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

