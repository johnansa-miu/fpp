package lab8.prob1;

import java.util.Objects;

public class Key {
    private final String firstName;
    private final String lastName;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key key)) return false;
        return Objects.equals(firstName, key.firstName) &&
                Objects.equals(lastName, key.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + "]";
    }
}
