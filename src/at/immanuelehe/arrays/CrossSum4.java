package at.immanuelehe.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrossSum4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        int input = 0;

        System.out.println("Geben Sie die Zahl ein von welcher die Iterierte Quersumme berechnet werden soll.");

        while(error) {
            try {
                input = scanner.nextInt();
                scanner.nextLine();
                error = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Bitte geben Sie keine Kommastellen oder zu hohen Zahlen ein.");
            }
        }

        int initial = input;

        while (input > 9){
            int tmp = input;
            input = 0;
            while (tmp > 0) {
                input += tmp % 10;
                tmp /= 10;
            }
        }

        System.out.println("Die Iterierte Quersumme von " + initial + " ist " + input);

    }

}
