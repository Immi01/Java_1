package at.immanuelehe.objektorientierung.handy.objects;

public class Phone {

    private String color;
    private Camera camera;
    private SIM sim;
    private SDCard card;


    public Phone(String color, Camera camera, SIM sim, SDCard sdCard) {
        this.color = color;
        this.camera = camera;
        this.sim = sim;
        this.card = sdCard;
    }

    public void takePicture() {

    }

    public void makeCall(String number) {
        sim.doCall(number);
    }

}
