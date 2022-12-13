package at.immanuelehe.objektorientierung.fernbedienung;

import at.immanuelehe.objektorientierung.fernbedienung.objects.Battery;

public class Remote {

    public static void main(String[] args) {

        Battery battery1 = new Battery();
        Battery battery2 = new Battery();
        Battery[] batteries = {battery1, battery2};

        turnOn(batteries);
        getStatus(batteries);
        turnOff(batteries);

    }

    static void getStatus(Battery[] batteries) {
        System.out.print("Der derzeitige Ladestand beträgt ");
        int statusInPercent = (int)(((batteries[0].getChargingStatus() + batteries[1].getChargingStatus())/2)*100/((batteries[0].getCapacity() + batteries[1].getCapacity())/2));
        System.out.print(statusInPercent);
        System.out.println(" %.");
        System.out.println();
    }

    static void turnOn(Battery[] batteries) {
        batteries[0].setChargingStatus(batteries[0].getChargingStatus()-batteries[0].getChargingStatus()*0.05f);
        batteries[1].setChargingStatus(batteries[1].getChargingStatus()-batteries[1].getChargingStatus()*0.05f);
        System.out.println();
    }

    static void turnOff(Battery[] batteries) {
        //just turn off
        batteries[0].turnOff();
        batteries[1].turnOff();
        System.out.println();
    }

}
