package at.ImmanuelEhe.basics;

import java.util.Random;

public class IfBedingung {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);

        if(randomNumber < 20){
            // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
            System.out.println("Mini");
        } else if(randomNumber < 50){
            // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
            System.out.println("Medium");
        } else {
            // Wenn die Zahl größer als 50 ist gib aus "Large"
            System.out.println("Large");
        }



        /*
        // Gib die Zufallszahl aus
        System.out.println(randomNumber);

        // Wenn die Zahl kleiner ist als 20 gib aus "Mini"
        if(randomNumber < 20){
            System.out.println("Mini");
        }

        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        if(randomNumber > 20 && randomNumber < 50){
            System.out.println("Medium");
        }

        // Wenn die Zahl größer als 50 ist gib aus "Large"
        if(randomNumber > 50){
            System.out.println("Large");
        }
        */

    }
}
