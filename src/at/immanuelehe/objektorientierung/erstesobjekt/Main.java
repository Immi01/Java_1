package at.immanuelehe.objektorientierung.erstesobjekt;

import at.immanuelehe.objektorientierung.erstesobjekt.objects.*;

public class Main {

    public static void main(String[] args) {
        int a = 7;

        Wheel wheel1 = new Wheel(205, 55, Wheel.Condition.GOOD);
        Wheel wheel2 = new Wheel(205, 55, Wheel.Condition.GOOD);
        Wheel wheel3 = new Wheel(210, 55, Wheel.Condition.OK);
        Wheel wheel4 = new Wheel(210, 55, Wheel.Condition.OK);

        Backmirror backmirror1 = new Backmirror(10, 20);
        Backmirror backmirror2 = new Backmirror(10, 20);

        Wheel[] wheels1 = {wheel1, wheel2, wheel3, wheel4};
        Backmirror[] backmirrors1 = {backmirror1, backmirror2};



        Engine c1Engine = new Engine(false, 30);
        Tank c1Tank = new Tank(80, 70, Tank.TYPE.DIESEL);
        Car c1 = new Car(c1Engine, c1Tank, wheels1, backmirrors1,  7, "Audi", "A1234");


        Engine c2Engine = new Engine(false, 45);
        Tank c2Tank = new Tank(110, 20, Tank.TYPE.PETROL);
        Car c2 = new Car(c2Engine, c2Tank, wheels1, backmirrors1,6, "Mercedes", "M1234");


        Engine c3Engine = new Engine(false, 20);
        Tank c3Tank = new Tank(50, 40, Tank.TYPE.DIESEL);
        Car c3 = new Car(c3Engine, c3Tank, wheels1, backmirrors1,17, "Opel", "1234O");

        System.out.println(c3.getSerialNumber());


        c2.pressBreak();

        c2.turboBoost();

        c2.honk(2);

        System.out.println(c2.getRemainingRange());

    }

}
