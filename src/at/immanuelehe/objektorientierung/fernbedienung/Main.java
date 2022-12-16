package at.immanuelehe.objektorientierung.fernbedienung;

import at.immanuelehe.objektorientierung.fernbedienung.objects.*;

public class Main {

    public static void main(String[] args) {

        Battery battery1 = new Battery();
        Battery battery2 = new Battery();
        Battery[] batteries = new Battery[]{battery1, battery2};

        Remote remote1 = new Remote(batteries);

        remote1.turnOn();
        remote1.getStatus();
        remote1.turnOff();

        Remote remote2 = new Remote();

        remote2.turnOn();
        remote2.getStatus();
        remote2.turnOff();

    }

}
