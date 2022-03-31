package at.ImmanuelEhe.Bankomat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat {

    static int input = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;

        int balance = 0;

        while(!exit){

            System.out.println();
            System.out.println("Wählen sie eine Option aus:");
            System.out.println("geben sie 1 für eine Einzahlung ein.");
            System.out.println("2 für eine Auszahlung.");
            System.out.println("3 um den Kontostand einzusehen.");
            System.out.println("4 um sich abzumelden.");
            System.out.println();

            input("Bitte geben sie eine der oben genannten Zahlen ein.", true);

            switch(input){
                case 1:

                    System.out.println();
                    System.out.println("Bitte geben sie den Betrag ein, den Sie Einzahlen wollen.");
                    System.out.println();
                    input("Bitte geben sie keine Kommastellen oder zu hohen Zahlen ein.");


                    balance += input;
                    System.out.println();
                    if(input == 1)
                        System.out.println("Es wurde " + input + " Euro eingezahlt.");
                    else
                        System.out.println("Es wurden " + input + " Euro eingezahlt.");
                    System.out.println();
                    break;

                case 2:

                    System.out.println();
                    System.out.println("Bitte geben sie den Betrag ein, den Sie sich Auszahlen lassen wollen.");
                    System.out.println();
                    input("Bitte geben sie keine Kommastellen oder zu hohen Zahlen ein.");


                    System.out.println();
                    if(input <= balance) {
                        balance -= input;
                        System.out.println("Es wurden " + input + " Euro abgehoben.");

                    } else {
                        System.out.println("Sie können nicht mehr Geld abheben als sie besitzen.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Ihr derzeitiger Kontostand beträgt " + balance + " Euro");
                    break;

                case 4:
                    System.out.println("Sie wurden abgemeldet.");
                    exit = true;
                    break;

                default:
                    System.out.println("Bitte geben sie eine der oben genannten Zahlen ein.");

            }
        }

    }

    static void input (String errMessage){
        input(errMessage, false);
    }

    static void input(String errMessage, boolean notPrintLast){

        boolean Error = true;
        int counter = 0;
        int maxValue = 5;

        while(Error && counter < maxValue) {
            try {
                input = scanner.nextInt();
                Error = false;
            } catch (InputMismatchException e) {
                scanner.next();
                if(counter != maxValue - 1 || !notPrintLast)
                    System.out.println(errMessage);
                Error = true;
            }
            counter++;
            if (counter == maxValue && Error)
                input = 0;
        }
    }

}
