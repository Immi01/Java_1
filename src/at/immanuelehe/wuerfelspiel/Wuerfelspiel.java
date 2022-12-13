package at.immanuelehe.wuerfelspiel;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {

    static int input = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Erstelle ein Würfelspiel! Du spielst gegen den Computer. Wenn das Spiel startet (mit einem kleinen Menü),
        hat der Spieler 6 Würfe. Er spielt dabei gegen den Computer. Wenn die Augensumme höher ist als jene des
        Computers hat der Spieler gewonnen, ansonsten der Computer.
         */

        boolean exit = false;

        Random random = new Random();


        while(!exit){
            int[] pointsHuman = new int[6];
            int[] pointsComp = new int[6];
            int finalPointsHuman = 0;
            int finalPointsComp = 0;


            System.out.println("Würfelspiel");
            System.out.println();
            System.out.println("Sie haben 6 Würfe, am Ende dieser 6 Würfe werden die Augensummen zusammen addiert.");
            System.out.println("Der Computer würfelt auch und wenn die zusammen addierte Augensumme des Computers");
            System.out.println("geringer ist als Ihre haben sie gewonnen.");
            System.out.println();
            System.out.println("Drücken Sie ’Enter’ um einen Würfel zu werfen.");

            for (int i = 0; i < 6; i++) {
                scanner.nextLine();

                pointsHuman[i] = random.nextInt(6) + 1;
                finalPointsHuman += pointsHuman[i];
                System.out.printf("Sie haben eine %d gewürfelt!%n", pointsHuman[i]);

                pointsComp[i] = random.nextInt(6) + 1;
                finalPointsComp += pointsComp[i];
                System.out.printf("Der Computer hat eine %d gewürfelt.%n", pointsComp[i]);
            }

            System.out.println();
            System.out.printf("Sie haben insgesamt eine Augenzahl von %d + %d + %d + %d + %d + %d = %d erwürfelt.%n", pointsHuman[0], pointsHuman[1], pointsHuman[2], pointsHuman[3], pointsHuman[4], pointsHuman[5], finalPointsHuman);

            System.out.printf("Der Computer hat eine Gesamtaugenzahl von %d + %d + %d + %d + %d + %d = %d erreicht.%n", pointsComp[0], pointsComp[1], pointsComp[2], pointsComp[3], pointsComp[4], pointsComp[5], finalPointsComp);

            if (finalPointsHuman > finalPointsComp){
                System.out.println("Sie haben somit gegen den Computer gewonnen!");
            } else {
                System.out.println("Sie haben also leider verloren.");
            }
            System.out.println();


            System.out.println("Falls Sie noch eine Runde spielen wollen geben Sie eine 1 ein, andernfalls eine 2.");

            input("Geben Sie eine der oben genannten Zahlen ein! Nach 5 Fehlversuchen werden sie abgemeldet.", true);

            if(input != 1)
                exit = true;

            System.out.println();
            System.out.println();
        }

        System.out.println("Sie wurden abgemeldet!");
        scanner.close();

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
                scanner.nextLine();
                Error = false;
            } catch (InputMismatchException e) {
                scanner.next();
                if(counter != maxValue - 1 || !notPrintLast)
                    System.out.println(errMessage);
            }
            counter++;
            if (counter == maxValue && Error)
                input = 0;
        }
    }

}
