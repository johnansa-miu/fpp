package lab4.problem4;

abstract public class Appliance {
    abstract void performFunction();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
