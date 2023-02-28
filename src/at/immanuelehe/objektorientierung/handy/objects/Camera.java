package at.immanuelehe.objektorientierung.handy.objects;

public class Camera {

    private final int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public PhoneFile makePicture() {
        PhoneFile phoneFile = new PhoneFile(".jpg", 1600, "pic ");
        return phoneFile;
    }

}
