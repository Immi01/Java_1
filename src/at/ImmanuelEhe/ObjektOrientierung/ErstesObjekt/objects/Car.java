package at.ImmanuelEhe.ObjektOrientierung.ErstesObjekt.objects;

public class Car {
    // Instanz / Gedächtnisvariablen

    //dont do that later
    public int fuelConsumption;
    public int fuelAmount;
    public int tankVolume;
    public String brand;
    public String serialNumber;
    private String color;


    public Car(int fuelConsumption, String brand, String serialNumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void pressBreak() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (this.fuelAmount > tankVolume/10)
            System.out.println("SuperBoostMode");
        else
            System.out.println("Not enough fuel to go to Superboost");
    }

    public void honk(int amountOfRepetitions) {
        while (amountOfRepetitions > 0) {
            System.out.println("Tuuut");
            amountOfRepetitions--;
        }
    }

    public int getRemainingRange() {
        return this.fuelAmount/fuelConsumption*100;
    }

}
