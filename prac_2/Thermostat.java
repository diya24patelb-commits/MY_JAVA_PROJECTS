public class Thermostat {
    private String location;
    private int temperature;
    private static final int MIN = 16;
    private static final int MAX = 30;
    private static int activeCount = 0;

    public Thermostat(String location, int startTemp) {
        this.location = location;
        if (startTemp >= MIN && startTemp <= MAX) {
            this.temperature = startTemp;
        }
        else {
            this.temperature = 22;
        }
        activeCount++;
    }

    public Thermostat(String location) {
        this(location, 22);
    }

    public void raise() {
        if (temperature < MAX) {
            temperature++;
        } 
        else {
            System.out.println("Already at maximum (30)");
        }
    }

    public void lower() {
        if (temperature > MIN) {
            temperature--;
        } 
        else {
            System.out.println("Already at minimum (16)");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public static int getActiveCount() {
        return activeCount;
    }

    public static void main(String[] args) {
        Thermostat thermo1 = new Thermostat("Living Room", 20);
        Thermostat thermo2 = new Thermostat("Bedroom");

        System.out.println("--- Testing raise() for Thermostat 1 ---");
        for (int i = 0; i < 10; i++) {
            thermo1.raise();
            System.out.println("Current Temperature: " + thermo1.getTemperature());
        }

        System.out.println("\n--- Testing lower() for Thermostat 1 ---");
        for (int i = 0; i < 20; i++) {
            thermo1.lower();
            System.out.println("Current Temperature: " + thermo1.getTemperature());
        }

        System.out.println("\nActive Thermostat Count: " + Thermostat.getActiveCount());
    }
}
