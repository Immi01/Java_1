package at.ImmanuelEhe.basics;

import java.util.Random;

public class Switch1 {

    public static void main(String[] args) {

        // Erstelle eine Zufallszahl zwischen 5 und 10
        Random random = new Random();
        int randomNum = random.nextInt(5,10);


        switch(randomNum) {
            case(10):
                // Wenn der Wert 10 ist gib aus Ten
                System.out.println("Ten");
                break;

            case(9):
                // Wenn der Wert 9 ist gib aus Nine
                System.out.println("Nine");
                break;

            case(8):
                // Wenn der Wert 8 ist gib aus Eight
                System.out.println("Eight");
                break;

            // etc.
            case(7):
                System.out.println("Seven");
                break;

            case(6):
                System.out.println("Six");
                break;

            case(5):
                System.out.println("Five");
                break;
        }


    }

}
