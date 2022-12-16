package at.immanuelehe.examples.cars.objects;

public class Car {

    private int maxSpeed;
    private int basePrice;
    private float baseFuelConsumption;
    private Producer producer;
    private Engine engine;
    private int milage;

    public Car(String name, String countryOfOrigin, float percentDiscount, Engine.TYPE type, int performance, int maxSpeed, int basePrice, int baseFuelConsumption, int milage) {
        this.producer = new Producer(name, countryOfOrigin, percentDiscount);
        this.engine = new Engine(type, performance);
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseFuelConsumption = baseFuelConsumption;
        this.milage = milage;
    }

    public Car(Producer producer, Engine.TYPE type, int performance, int maxSpeed, int basePrice, int baseFuelConsumption, int milage) {
        this.producer = producer;
        this.engine = new Engine(type, performance);
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseFuelConsumption = baseFuelConsumption;
        this.milage = milage;
    }

    public float getPrice() {
        float discount = producer.getPercentDiscount();
        return basePrice * (1f - discount / 100f);
    }

    public float getFuelConsumption() {
        if (milage > 50000)
            return (float)Math.round(baseFuelConsumption * 109.8f)/100;
        else
            return baseFuelConsumption;
    }

}
