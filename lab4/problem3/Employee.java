package lab4.problem3;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double getPayment();

    protected String getClassName(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getClassName() + " " + "[firstName=" + firstName + ", lastName=" + lastName +
                ", socialSecurityNumber=" + socialSecurityNumber + ", payment=" + String.format("%.2f", getPayment());
    }
}
