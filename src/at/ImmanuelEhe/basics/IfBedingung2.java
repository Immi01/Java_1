package at.ImmanuelEhe.basics;

import java.util.Random;

public class IfBedingung2 {
    public static void main(String[] args) {

        // Erstelle zwei Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);


        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        if(randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }


        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        if(randomNumber1 < 30 || randomNumber2 < 30) {
            // dann gib aus "Eine der beiden ist kleiner als 30"
            System.out.println("Eine der beiden ist kleiner als 30");
        }


        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        if(randomNumber1 < 50 && randomNumber2 != 50) {
            // dann gib aus "Erste Zahl klein, zweite kein 50iger"
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }






    }
}
