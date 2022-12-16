package at.immanuelehe.examples.cars;

import at.immanuelehe.examples.cars.objects.Car;
import at.immanuelehe.examples.cars.objects.Engine;
import at.immanuelehe.examples.cars.objects.Producer;

public class Main {

    public static void main(String[] args) {

        Producer ferrari = new Producer("Ferrari", "Italy", 0.5f);

        Car car1 = new Car("Ferrari", "Italy", 0.5f, Engine.TYPE.PETROL, 300, 240, 250000, 12, 60000);

        Car car2 = new Car(ferrari, Engine.TYPE.PETROL, 300, 240, 250000, 12, 30000);

        System.out.println(car1.getPrice() + " €");
        System.out.println(car1.getFuelConsumption());

    }

}
