package at.immanuelehe.objektorientierung.lampe.objects;

import java.util.ArrayList;
import java.util.Arrays;

public class Lamp {

    private ArrayList<LightElement> lightElements = new ArrayList<LightElement>();

    public Lamp(LightElement[] lightElements) {
        this.lightElements.addAll(Arrays.asList(lightElements));
    }

    public Lamp(LightElement lightElement) {
        lightElements.add(lightElement);
    }

    public Lamp(String name, String color, Double powerUsage, LightElement.STATUS status) {
        LightElement lightElement = new LightElement(name, color, powerUsage, status);
        lightElements.add(lightElement);
    }

    public void addLightElement(LightElement lightElement) {
        this.lightElements.add(lightElement);
    }

    public void turnAllOn() {
        for (LightElement lightElement : lightElements)
            lightElement.turnOn();
    }

    public double getOverallPowerUsage() {
        double overallPowerUsage = 0;
        for(LightElement lightElement : lightElements)
            overallPowerUsage += lightElement.getPowerUsage();
        return overallPowerUsage;
    }

    public void printNamesOfLightElements() { // Printet die Namen aller Lichtelemen auf die Konsole.
        for(LightElement lightElement : lightElements)
            System.out.println(lightElement.getName());
    }

}
