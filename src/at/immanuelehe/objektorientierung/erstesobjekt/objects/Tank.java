package at.immanuelehe.objektorientierung.erstesobjekt.objects;

public class Tank {

    public enum TYPE {DIESEL, PETROL};
    private int fuelAmount;
    private int tankVolume;
    private TYPE type;

    public Tank(int tankVolume, int fuelAmount, TYPE type) {
        this.tankVolume = tankVolume;
        if (fuelAmount > tankVolume)
            this.fuelAmount = tankVolume;
        else if (fuelAmount < 0)
            this.fuelAmount = 0;
        this.type = type;
    }



    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
