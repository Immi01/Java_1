package at.immanuelehe.objektorientierung.handy.objects;

import java.util.List;

public class Phone {

    private String color;
    private Camera camera;
    private SIM sim;
    private SDCard card;


    public Phone(String color) {
        this.color = color;
        this.camera = new Camera(1920);
        this.sim = new SIM(0, "+43 660 5916942 ");
        this.card = new SDCard(30000);
    }

    public Phone(String color, Camera camera, SIM sim, SDCard sdCard) {
        this.color = color;
        this.camera = camera;
        this.sim = sim;
        this.card = sdCard;
    }

    public void takePicture() {
        try {
            card.saveFile(camera.makePicture());
        } catch (Exception tooLarge) {
            System.out.println("Es gibt keinen Platz mehr auf der SDCard!");
        }
    }

    public void makeCall(String number) {
        sim.doCall(number);
    }

    public int getFreeSpace() {
        return card.getFreeSpace();
    }

    public void printAllFiles() {
        try {
            List<PhoneFile> allFiles = card.getAllFiles();
            for (PhoneFile File : allFiles) {
                System.out.println(File.getInfo());
            }
        } catch (NullPointerException e) {
            System.out.println("Es gibt keine Auszugebenden Files!");
        }
    }

}
