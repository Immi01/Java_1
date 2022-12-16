package at.immanuelehe.examples.cars.objects;

public class Engine {

    public enum TYPE {DIESEL, PETROL};
    private TYPE type;
    private int performance;

    public Engine(TYPE type, int performance) {
        this.type = type;
        this.performance = performance;
    }

}
