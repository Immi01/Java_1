package at.ImmanuelEhe.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        byte[] cords = new byte[2];
        byte[][] playField = new byte[3][3];
        boolean error = true;

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println();
        System.out.println("You can enter the coordinates of");
        System.out.println("your next mark in the following form:");
        System.out.println("x,y     x stands for the column and y for the row");
        System.out.println();
        System.out.println("The columns get counted from left to right");
        System.out.println("and the rows from bottom to top.");
        System.out.println();
        System.out.println("********************");

        while (true) {
            System.out.println("Current raster:");
            printRaster(playField);
            System.out.println("Player 1 (X):");

            while (error) {
                input = scanner.nextLine();
                cords = decryptInput(input);
                if (cords[0] != 4)
                    error = false;
                if (cords[0] > 2 || cords[0] < 0 || cords[1] > 2 || cords[1] < 0) {
                    System.out.println("The values for x and y need to be between 1 and 3.");
                    error = true;
                }
            }

            playField[cords[0]][cords[1]] = 1;

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


        try {
            if (individualChars.length != 3)
                throw new InputMismatchException();
        } catch (InputMismatchException e) {
            System.out.println("Please enter the coordinates in the following form: x,y");
            deciphered[0] = 4;
            return deciphered;
        }

        try {
            deciphered[0] =  Byte.parseByte(individualChars[0]);
            deciphered[1] =  Byte.parseByte(individualChars[2]);
        } catch (NumberFormatException e){
            System.out.println("x and y need to be numbers");
            deciphered[0] = 4;
            return deciphered;
        }


        return deciphered;
    }



}
