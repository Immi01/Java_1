package at.ImmanuelEhe.Arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CaesarVerschluesselung {

    static int input = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /* Bei der Cäsar-Verschlüsselung werden die Buchstaben um eine fixe Anzahl Stellen verschoben
        (z.B. 2 a wird zu c, f wird zu h, z wird zu b, usw.)
        Implementiere eine Methode encrypt(String):String und eine Methode decrypt(String):String */

        boolean exit = false;
        boolean madeInput;

        while(!exit) {

            System.out.println("Hallo,");
            System.out.println("um einen Text zu verschlüsseln geben Sie eine eins ein,");
            System.out.println("um einen Text zu entschlüsseln geben Sie eine zwei ein.");
            System.out.println("Um das Programm zu beenden geben Sie eine drei ein.");
            System.out.println();

            input("Bitte geben Sie eine der oben genannten Zahlen ein.", true);

            switch (input) {
                case 1:

                    System.out.println("Bitte geben Sie ein um wie viele Stellen die Buchstaben verschoben werden sollen.");
                    madeInput = input("Bitte geben Sie keine Kommastellen oder zu hohen Zahlen ein.");
                    if (!madeInput)
                        System.out.println("Sie müssen eine gültige Zahl eingeben.");
                    else {
                        System.out.println("Geben Sie den zu verschlüsselden Text ein.");
                        System.out.printf("Der verschlüsselte Text lautet '%s'.", encrypt(scanner.nextLine()));
                    }
                    break;

                case 2:

                    System.out.println("Bitte geben Sie ein um wie viele Stellen die Buchstaben verschoben wurden.");
                    madeInput = input("Bitte geben Sie keine Kommastellen oder zu hohen Zahlen ein.");
                    if (!madeInput)
                        System.out.println("Sie müssen eine gültige Zahl eingeben.");
                    else {
                        System.out.println("Geben Sie den zu entschlüsselnden Text ein.");
                        System.out.printf("Der entschlüsselte Text lautet '%s'.", decrypt(scanner.nextLine()));
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Das Programm wird beendet.");
                    break;

                default:
                    System.out.println("Bitte geben Sie eine der oben genannten Zahlen ein.");
                    break;
            }

            System.out.println();
            System.out.println();

        }

        scanner.close();
    }


    static String encrypt(String stringInput){

        char[] charInput = stringInput.toCharArray();
        for(int i = 0; i < charInput.length; i++){
            charInput[i] += input;
        }
        stringInput = String.valueOf(charInput);

        return stringInput;
    }


    static String decrypt(String stringInput){

        char[] charInput = stringInput.toCharArray();
        for(int i = 0; i < charInput.length; i++){
            charInput[i] -= input;
        }
        stringInput = String.valueOf(charInput);

        return stringInput;
    }


    static boolean input (String errMessage){
        return input(errMessage, false);
    }

    static boolean input(String errMessage, boolean notPrintLast){

        boolean error = true;
        int counter = 0;
        int maxValue = 5;

        while(error && counter < maxValue) {
            try {
                input = scanner.nextInt();
                scanner.nextLine();
                error = false;
            } catch (InputMismatchException e) {
                scanner.next();
                if(counter != maxValue - 1 || !notPrintLast)
                    System.out.println(errMessage);
            }
            counter++;
            if (counter == maxValue && error)
                input = 0;
        }
        return !error;
    }

}
