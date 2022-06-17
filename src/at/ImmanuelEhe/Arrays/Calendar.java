package at.ImmanuelEhe.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {


        int month;
        int startDay;

        System.out.println("Bitte geben Sie den Monat ein den Sie darstellen wollen.");
        System.out.println("1 für Januar, 2 für Februar, 3 für März, usw.");
        System.out.println();

        month = input();

        while (month < 1 || month > 12){
            System.out.println("Geben Sie eine Zahl zwischen 1 und 12 ein.");
            month = input();
        }

        System.out.println();
        System.out.println("Bitte geben Sie den Tag ein an welchem der Monat beginnt.");
        System.out.println("1 für Montag, 2 für Dienstag, 3 für Mittwoch, usw.");
        System.out.println();

        startDay = input()-1;

        while (startDay < 0 || startDay > 6){
            System.out.println("Geben Sie eine Zahl zwischen 1 und 7 ein.");
            startDay = input()-1;
        }

        System.out.println();

        printCalendar(month, startDay);

    }

    public  static  int input(){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                return (scanner.nextInt());
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Bitte geben Sie keine Kommastellen oder zu hohen Zahlen ein.");
            } finally {
                scanner.nextLine();
            }
        }

    }

    public static void printCalendar(int month, int startDay){

        int numOfDays;
        String[] days = {"MO","DI","MI","DO","FR","SA","SO"};
        int i = 0;

        if (month == 2)
            numOfDays = 28;
        else if (month % 2 == 0 && month <= 7)
            numOfDays = 30;
        else if (month % 2 == 1 && month <= 7)
            numOfDays = 31;
        else if (month % 2 == 0)
            numOfDays = 31;
        else
            numOfDays = 30;


        while (i<7){
            if (i == 0)
                System.out.print("| ");
            else
                System.out.print(" | ");

            System.out.print(days[i]);
            i++;

            if (i == 7) System.out.println(" |");
        }
        i = 0;


        while (i < numOfDays + startDay + 7 - (numOfDays + startDay)%7) {
            if (i%7 == 0)
                System.out.print("| ");
            else
                System.out.print(" | ");

            if (i < startDay || i > numOfDays+startDay-1) System.out.print("  ");
            else System.out.print(i-startDay+1);

            if (i-startDay+1<10 && i >= startDay) System.out.print(" ");
            i++;

            if (i%7 == 0) System.out.println(" |");
        }

    }

}
