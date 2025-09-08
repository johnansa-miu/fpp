package lab4.problem4;

public class Refrigerator extends Appliance {
    private final int temperature;

    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void performFunction() {
        System.out.println("Cooling items at temperature: " + temperature + "°C.");
    }
}
