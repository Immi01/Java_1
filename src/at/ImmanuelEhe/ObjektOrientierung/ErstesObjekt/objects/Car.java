package at.ImmanuelEhe.ObjektOrientierung.ErstesObjekt.objects;

public class Car {
    // Instanz / Gedächtnisvariablen

    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private String color;
    private final Engine engine;
    private final Tank tank;
    private Backmirror[] backmirror = new Backmirror[2];
    private Wheel[] wheel = new Wheel[4];


    public Car(Engine engine, Tank tank, Wheel[] wheel, Backmirror[] backmirror, int fuelConsumption, String brand, String serialNumber){
        this.engine = engine;
        this.tank = tank;
        this.wheel = wheel;
        this.backmirror = backmirror;
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive(int speed) {
        tank.setTankVolume(tank.getFuelAmount() - fuelConsumption);
        engine.setOn(true);
        engine.setSpeed(speed);
        System.out.println("I am driving");
    }

    public void pressBreak() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (tank.getFuelAmount() > tank.getTankVolume()/10)
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



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getRemainingRange() {
        return tank.getFuelAmount()/fuelConsumption*100;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
