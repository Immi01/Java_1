package at.ImmanuelEhe.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        byte[] cords = new byte[2];
        byte[][] playField = new byte[3][3];

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println();
        System.out.println("You can enter the coordinates of your next mark in the following form:");
        System.out.println("x,y     x stands for the column and y for the row");
        System.out.println("The columns get counted from left to right and the rows from bottom to top.");
        System.out.println();
        System.out.println("********************");

        while (true){
            System.out.println("Current raster:");
            printRaster(playField);
            System.out.println("Player 1 (X):");

            input = scanner.nextLine();
            cords = decryptInput(input);

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

    static byte[] decryptInput(String originalInput){

        byte[] deciphered = new byte[2];
        String[] individualChars = originalInput.split("");
        boolean error = true;

        while(error) {
            try {
                if (individualChars.length != 3)
                    throw new InputMismatchException();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Please enter the coordinates in the in the following form: x,y");
            }
        }
        deciphered[0] =  Byte.valueOf(individualChars[0]);
        System.out.println(deciphered[0]);

        return deciphered;
    }

}
