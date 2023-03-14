package at.immanuelehe.objektorientierung.kamera.objects;

public class Lens {

    private Manufacturer manufacturer;
    private float focalLength;

    public Lens(Manufacturer manufacturer, float focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public float getFocalLength() {
        return focalLength;
    }

}
