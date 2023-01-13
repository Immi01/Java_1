package at.immanuelehe.objektorientierung.lampe;


import at.immanuelehe.objektorientierung.lampe.objects.Lamp;
import at.immanuelehe.objektorientierung.lampe.objects.LightElement;

public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp("Lichtelement 1", "rot", 1.3d, LightElement.STATUS.OFF);
        System.out.println(lamp.getOverallPowerUsage());
        lamp.addLightElement(new LightElement("Lichtelement 2","grün", 0.2d, LightElement.STATUS.ON));
        lamp.addLightElement(new LightElement("Lichtelement 3","blau", 0.9d, LightElement.STATUS.OFF));
        lamp.printNamesOfLightElements();
        System.out.println(lamp.getOverallPowerUsage());
        lamp.turnAllOn();
        System.out.println(lamp.getOverallPowerUsage());
    }

}
