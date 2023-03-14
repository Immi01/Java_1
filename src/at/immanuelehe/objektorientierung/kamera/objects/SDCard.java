package at.immanuelehe.objektorientierung.kamera.objects;

import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private int capacity;
    private List<Picture> pictures = new ArrayList<>();

    public SDCard(int capacity) {
        this.capacity = capacity;
    }

    public SDCard(int capacity, List<Picture> pictures) {
        this.capacity = capacity;
        this.pictures = pictures;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void savePicture (Picture picture) throws Exception {
        Exception tooBig = new Exception("Picture to save is too big");
        if (picture.getSize() > capacity)
            throw tooBig;
        pictures.add(picture);
        System.out.println("Saved " + picture.getName());
    }

}
