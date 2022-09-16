package at.ImmanuelEhe.TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        byte[] cords = new byte[2];
        byte[][] playField = new byte[3][3];

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        while (true){
            System.out.println("Current raster:");
            printRaster(playField);
            System.out.println("Player 1 (X):");

            input = scanner.nextLine();



        }

    }

    static void printRaster(byte[][] playField) {

        int i = 0;
        char[] values = new char[9];

        for (byte row = 0; row < 3; row++){

            for (byte col = 0; col < 3; col++){
                switch (playField[row][col]){
                    case 0:
                        values[i] = ' ';
                        break;
                    case 1:
                        values[i] = 'X';
                        break;
                    case 2:
                        values[i] = 'O';
                        break;
                }
                i++;
            }

        }

        System.out.println("┌───┬───┬───┐");
        System.out.printf("│ %c │ %c │ %c │%n", values[0], values[1], values[2]);
        System.out.println("├───┼───┼───┤");
        System.out.printf("│ %c │ %c │ %c │%n", values[3], values[4], values[5]);
        System.out.println("├───┼───┼───┤");
        System.out.printf("│ %c │ %c │ %c │%n", values[6], values[7], values[8]);
        System.out.println("└───┴───┴───┘");
    }

}
