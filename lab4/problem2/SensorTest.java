package lab4.problem2;

public class SensorTest {
    public static void main(String[] args) {
        Sensor[] sensors = new Sensor[5];
        sensors[0] = new TemperatureSensor(23.5, "Living Room");
        sensors[1] = new LightSensor(80.0, "Garden");
        sensors[2] = new SoundSensor(65.0, "Bedroom");
        sensors[3] = new TemperatureSensor(15.0, "Kitchen");
        sensors[4] = new SoundSensor(75.0, "Garage");

        for (Sensor s : sensors) {
            System.out.println(s);
            System.out.println();
        }
    }
}
