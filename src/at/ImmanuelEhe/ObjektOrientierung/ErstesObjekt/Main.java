package at.ImmanuelEhe.ObjektOrientierung.ErstesObjekt;

import at.ImmanuelEhe.ObjektOrientierung.ErstesObjekt.objects.Car;

public class Main {

    public static void main(String[] args) {
        int a = 7;

        /*Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.tankVolume = 80;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        c2.fuelAmount = 20;
        c2.tankVolume = 110;*/

        Car c3 = new Car(17, "Opel", "1234O");

        System.out.println(c3.serialNumber);

        /*
        c2.pressBreak();

        c2.turboBoost();

        c2.honk(2);

        System.out.println(c2.getRemainingRange())*/

    }

}
