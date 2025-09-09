package lab4.problem2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private final double soundLevel;
    private final String location;
    private LocalTime lastUpdated;

    public SoundSensor(double soundLevel, String location) {
        this.soundLevel = soundLevel;
        this.location = location;
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel > 70) {
            return "An alert to turn on noise cancellation";
        } else {
            return " Sound is within normal range";
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

