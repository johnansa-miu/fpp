package lab7.prob4;

public class Ticket {
    private final int id;
    private String description;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Ticket: {id=" + id + ", description='" + description + "'}";
    }
}
