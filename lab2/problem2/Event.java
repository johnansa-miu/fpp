package problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Event {
    private final String name;
    private final ZonedDateTime eventDateTime;

    public Event(String name, String date, String time, String timeZone) {
        this.name = name;
        this.eventDateTime = ZonedDateTime.of(LocalDate.parse(date), LocalTime.parse(time), ZoneId.of(timeZone));
    }

    public String getName() {
        return name;
    }

    public boolean isLeapYear() {
        return eventDateTime.toLocalDate().isLeapYear();
    }

    public String formatEventDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm");
        return String.format("%s [%s]", eventDateTime.format(formatter), eventDateTime.getZone());
    }

    public long daysUntilEvent() {
        return ChronoUnit.DAYS.between(LocalDate.now(), eventDateTime.toLocalDate());
    }

    public String getDayOfWeek() {
        return eventDateTime.getDayOfWeek().toString();
    }

    public String convertTimeZone(String targetTimeZone) {
        ZonedDateTime targetDateTime = eventDateTime.withZoneSameInstant(ZoneId.of(targetTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy @ HH:mm");
        return String.format("%s [%s]", targetDateTime.format(formatter), targetDateTime.getZone());
    }
}