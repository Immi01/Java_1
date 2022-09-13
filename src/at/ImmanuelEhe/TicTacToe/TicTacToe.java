package at.ImmanuelEhe.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;



        //"┌───┬────┬───┐"
        //"│   │    │   │"
        //"├───┼────┼───┤"
        //"│   │    │   │"
        //"├───┼────┼───┤"
        //"│   │    │   │"
        //"└───┴────┴───┘"

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        while (true){
            System.out.println("Current raster:");
            printRaster();
            System.out.println("Player 1 (x):");

            input = scanner.nextLine();



        }

    }

}
