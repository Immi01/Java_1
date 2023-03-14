package at.immanuelehe.objektorientierung.kamera;

import at.immanuelehe.objektorientierung.kamera.objects.Camera;
import at.immanuelehe.objektorientierung.kamera.objects.Lens;
import at.immanuelehe.objektorientierung.kamera.objects.Manufacturer;
import at.immanuelehe.objektorientierung.kamera.objects.SDCard;

public class Main {

    public static void main(String[] args) {
        Manufacturer sony = new Manufacturer("Sony", "Japan");
        Lens lens = new Lens(sony, 40);
        SDCard sdCard = new SDCard(16);
        Camera camera = new Camera(1920, 1080, 500, "red", sony, lens, sdCard);

        camera.takePicture(Camera.Quality.HIGH);

        Camera camera1 = new Camera(1920,1080,450,"red","sony","japan");
        System.out.println(camera1.getCapacity());

    }

}
