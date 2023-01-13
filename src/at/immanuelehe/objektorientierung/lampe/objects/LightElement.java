package at.immanuelehe.objektorientierung.lampe.objects;

public class LightElement {

    private String name;
    private String color;
    private double powerUsage;
    public enum STATUS {ON, OFF}
    private STATUS status;

    public LightElement(String name, String color, double powerUsage, STATUS status) {
        this.name = name;
        this.color = color;
        this.powerUsage = powerUsage;
        this.status = status;
    }

    public void turnOn() {
        if (status == STATUS.ON)
            System.out.printf("Mein Name ist %s. Ich bin bereits eingeschaltet%n", name);
        else {
            status = STATUS.ON;
            powerUsage += 5;
        }
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public String getName() {
        return name;
    }

}
