package at.immanuelehe.objektorientierung.handy.objects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Camera {

    private final int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public PhoneFile makePicture() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        return new PhoneFile(".jpg", (int) (1.7f * resolution), "pic" + dtf.format(LocalDateTime.now()));
    }

}
