package at.immanuelehe.objektorientierung.kamera.objects;

import java.util.Date;
import java.util.List;

public class Camera {

    private final int pixelX;
    private final int pixelY;
    private final int weight;
    private final String color;
    private final Manufacturer manufacturer;
    private SDCard sdCard;
    public enum Quality {HIGH, MEDIUM, LOW}

    public Camera(int pixelX, int pixelY, int weight, String color, Manufacturer manufacturer, Lens lens, SDCard sdCard) {
        this.pixelX = pixelX;
        this.pixelY = pixelY;
        this.weight = weight;
        this.color = color;
        this.manufacturer = manufacturer;
        this.sdCard = sdCard;
    }

    public Camera(int pixelX, int pixelY, int weight, String color, String manufacturer, String country) {
        this.manufacturer = new Manufacturer(manufacturer, country);
        this.pixelX = pixelX;
        this.pixelY = pixelY;
        this.weight = weight;
        this.color = color;
        this.sdCard = new SDCard(16);
    }

    public void takePicture(Quality quality) {
        Picture picture = null;
        switch (quality) {
            case LOW -> picture = new Picture(new Date(), 2);
            case MEDIUM -> picture = new Picture(new Date(), 4);
            case HIGH -> picture = new Picture(new Date(), 6);
        }
        try {
            sdCard.savePicture(picture);
        } catch (Exception tooBig) {
            System.out.println("The Picture is too big, SDCard: " + sdCard.getCapacity() + " picture: " + picture.getSize());
        }
    }

    public int getPixelX() {
        return pixelX;
    }

    public int getPixelY() {
        return pixelY;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getCapacity() {
        return sdCard.getCapacity();
    }

    public List<Picture> getPictures() {
        return sdCard.getPictures();
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }
}
