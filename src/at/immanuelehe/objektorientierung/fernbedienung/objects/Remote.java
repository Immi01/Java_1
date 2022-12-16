package at.immanuelehe.objektorientierung.fernbedienung.objects;

import at.immanuelehe.objektorientierung.fernbedienung.objects.Battery;

public class Remote {

    private Battery[] batteries;

    public Remote() {
        Battery battery1 = new Battery();
        Battery battery2 = new Battery();
        this.batteries = new Battery[]{battery1, battery2};
    }

    public Remote(Battery[] batteries) {
        this();
        this.batteries = batteries;
    }

    public void getStatus() {
        System.out.print("Der derzeitige Ladestand beträgt ");
        int statusInPercent = (int)(((batteries[0].getChargingStatus() + batteries[1].getChargingStatus())/2)*100/((batteries[0].getCapacity() + batteries[1].getCapacity())/2));
        System.out.print(statusInPercent);
        System.out.println(" %.");
        System.out.println();
    }

    public void turnOn() {
        batteries[0].setChargingStatus(batteries[0].getChargingStatus()-batteries[0].getChargingStatus()*0.05f);
        batteries[1].setChargingStatus(batteries[1].getChargingStatus()-batteries[1].getChargingStatus()*0.05f);
        System.out.println();
    }

    public void turnOff() {
        //just turn off
        batteries[0].turnOff();
        batteries[1].turnOff();
        System.out.println();
    }

}
