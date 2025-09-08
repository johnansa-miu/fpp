package lab4.problem4;

public class Microwave implements Appliance {
    private final int powerLevel;

    public Microwave(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String heatFood() {
        return "Heating food at power level: " + powerLevel + ".";
    }

    @Override
    public void performFunction() {
        System.out.println(heatFood());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
