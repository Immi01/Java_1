package at.immanuelehe.arrays;

import java.util.Random;

public class Aufgabe2 {

    public static void main(String[] args) {

        // Erstelle ein Array von 50 Zufallszahlen mit Werten zwischen 0 und 100.
        // Gib alle Zahlen in einem For-Loop aus und berechne gleichzeitig die Summe der Zahlen.

        int[] RandomNums = new int[50];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < RandomNums.length; i++){
            RandomNums[i] = random.nextInt(0,100);
            sum += RandomNums[i];

            System.out.println(RandomNums[i]);
        }

        System.out.println(sum);

    }

}
