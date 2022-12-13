package at.immanuelehe.objektorientierung.fernbedienung.objects;

public class Battery {

    //default value 2,5 Ah
    private float capacity;
    private float chargingStatus;

    public Battery (float chargingStatus, float capacity) {
        this.chargingStatus = chargingStatus;
        this.capacity = capacity;
    }

    public Battery (float chargingStatus) {
        this(chargingStatus, 2.5f);
    }

    public Battery () {
        this(2.5f, 2.5f);
    }


    public void turnOff() {
        System.out.println("Kein Verbraucher Angeschlossen");
    };


    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(float chargingStatus) {
        this.chargingStatus = chargingStatus;
        System.out.println("Verbraucher Angeschlossen");
    }
}
