package at.ImmanuelEhe.ObjektOrientierung.ErstesObjekt.objects;

public class Engine {

    private enum TYPE {DIESEL, PETROL};
    private int speed;
    private boolean isOn;
    private TYPE type;


    public Engine(boolean isOn, int speed){
        if (speed < 1)
            this.speed = 1;
        else
            this.speed = Math.min(speed, 100);
        this.isOn = isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

}
