package at.immanuelehe.objektorientierung.erstesobjekt.objects;

public class Truck extends Car {

    private String trailer;

    public Truck(Engine engine, Tank tank, Wheel[] wheel, Backmirror[] backmirror, int fuelConsumption, String brand, String serialNumber, String trailer) {
        super(engine, tank, wheel, backmirror, fuelConsumption, brand, serialNumber);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

}
