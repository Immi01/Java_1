package at.immanuelehe.objektorientierung.handy;

import at.immanuelehe.objektorientierung.handy.objects.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("red");
        phone.makeCall("+41 33 751 2381");
        phone.takePicture();
        phone.printAllFiles();
        System.out.println(phone.getFreeSpace() + " kB");
    }

}
