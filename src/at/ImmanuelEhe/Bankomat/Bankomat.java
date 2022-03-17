package at.ImmanuelEhe.Bankomat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        int input = 0;

        while(!exit){

            System.out.println("Wählen sie eine Option aus:");
            System.out.println("geben sie 1 für eine Einzahlung ein.");
            System.out.println("2 für eine Auszahlung.");
            System.out.println("3 um den Kontostand einzusehen.");
            System.out.println("4 um sich abzumelden.");
            System.out.println();

            try{
                input = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Bitte geben sie eine Zahl ein.");
            }

            switch(input){
                case 1:

                    try{
                        System.out.println();
                        System.out.println("Bitte geben sie den Betrag ein, den Sie Einzahlen wollen.");
                        System.out.println();

                        input = scanner.nextInt();

                    } catch(InputMismatchException e) {
                        System.out.println("Bitte geben sie eine Zahl ein.");
                    }

                    balance += input;
                    System.out.println();
                    System.out.println("Es wurden " + input + " Euro eingezahlt.");
                    System.out.println();
                    break;

                case 2:

                    try{
                        System.out.println();
                        System.out.println("Bitte geben sie den Betrag ein, den Sie sich Auszahlen lassen wollen.");
                        System.out.println();

                        input = scanner.nextInt();

                    } catch(InputMismatchException e) {
                        System.out.println("Bitte geben sie eine Zahl ein.");
                    }

                    if(input <= balance) {
                        balance -= input;

                        System.out.println();
                        System.out.println("Es wurden " + input + " Euro abgehoben.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("Sie können nicht mehr Geld abheben als sie besitzen.");
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Ihr derzeitiger Kontostand beträgt " + balance + " Euro");
                    System.out.println();
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

    static void input(){
        try{
            input = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Bitte geben sie eine Zahl ein.");
        }
    }

}
