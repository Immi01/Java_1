package at.ImmanuelEhe.Strings.TicTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        byte[] cords = new byte[2];
        byte[][] playField = new byte[3][3];
        boolean error = true;
        boolean isFirstPlayer = true;
        byte playerThatWon = 0;

        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println();
        System.out.println("You can enter the coordinates of");
        System.out.println("your next mark in the following form:");
        System.out.println("x,y     x stands for the column and y for the row");
        System.out.println();
        System.out.println("The columns get counted from left to right");
        System.out.println("and the rows from top to bottom.");
        System.out.println();
        System.out.println("********************");

        do {
            System.out.println("Current raster:");
            printRaster(playField);
            if (isFirstPlayer)
                System.out.println("Player 1 (X):");
            else
                System.out.println("Player 2 (O):");

            while (error) {
                input = scanner.nextLine();
                cords = decryptInput(input);
                error = cords[0] == 4;
                if (!error && (cords[0] > 2 || cords[0] < 0 || cords[1] > 2 || cords[1] < 0)) {
                    System.out.println("The values for x and y need to be between 1 and 3.");
                    error = true;
                }
                if (!error && playField[cords[0]][cords[1]] != 0) {
                    System.out.println("This field is already occupied, please choose another one.");
                    error = true;
                }
            }
            System.out.println();

            if (isFirstPlayer)
                playField[cords[0]][cords[1]] = 1;
            else
                playField[cords[0]][cords[1]] = 2;


            playerThatWon = checkForWin(playField);
            switch (playerThatWon) {
                case 1 -> System.out.printf("%nPlayer 1 (X) has won!%n");
                case 2 -> System.out.printf("%nPlayer 2 (O) has won!%n");
                case 3 -> System.out.printf("%nNo player has won, it's a tie!%n");
            }

            if (playerThatWon != 0) {
                System.out.printf("The game will restart itself now.%n%n");
                for (byte row = 0; row < 3; row++)
                    for (byte col = 0; col < 3; col++)
                        playField[row][col] = 0;
                isFirstPlayer = false;
            }

            error = true;
            isFirstPlayer = !isFirstPlayer;
        } while (true);

    }


    static void printRaster(byte[][] playField) {

        int i = 0;
        char[] values = new char[9];

        for (byte row = 0; row < 3; row++){

            for (byte col = 0; col < 3; col++){
                switch (playField[row][col]) {
                    case 0 -> values[i] = ' ';
                    case 1 -> values[i] = 'X';
                    case 2 -> values[i] = 'O';
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


    static byte[] decryptInput(String originalInput) {

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
        
        deciphered[0]--;
        deciphered[1]--;

        return deciphered;
    }

    static byte checkForWin(byte[][] playField) {

        byte playerThatWon = 0;

        for(byte row = 0; row < 3; row++){
            playerThatWon = checkRow(playField[row]);
            if (playerThatWon != 0 && playerThatWon != 3)
                return playerThatWon;
        }
        if (playerThatWon == 3)
            return 0;

        if (checkIfFilled(playField))
            return 3;

        playerThatWon = checkColumns(playField);
        if (playerThatWon != 0)
            return playerThatWon;

        playerThatWon = checkDiagonals(playField);
        return playerThatWon;
    }

    static byte checkRow(byte[] row) {
        byte currentPlayer = row[0];

        for (byte b : row) {
            if (currentPlayer != b)
                return 0;
        }

        if (currentPlayer == 0)
            return 3;

        return currentPlayer;
    }

    static boolean checkIfFilled(byte[][] playField) {

        for (byte row = 0; row < 3; row++)
            for (byte column = 0; column < 3; column++)
                if (playField[row][column] != 0)
                    return false;
        return true;
    }

    static byte checkColumns(byte[][] playField) {
        byte currentPlayer = 0;


        for (byte row = 0; row < 3; row++) {
            currentPlayer = playField[row][0];
            if(currentPlayer != 0) {
                for (byte column = 0; column < 3; column++) {
                    if (currentPlayer != playField[column][row]) {
                        currentPlayer = 3;
                        break;
                    }
                }

                if (currentPlayer != 3)
                    return currentPlayer;
            }
        }

        return 0;
    }

    static byte checkDiagonals(byte[][] playField) {
        byte currentPlayer = playField[0][0];

        for (byte[] coordinate = {0, 0}; coordinate[0] < 3; coordinate[0]++, coordinate[1]++)
            if (currentPlayer != playField[coordinate[0]][coordinate[1]]) {
                currentPlayer = 3;
                break;
            }
        if (currentPlayer != 0 && currentPlayer != 3)
            return currentPlayer;

        currentPlayer = playField[2][0];

        for (byte[] coordinate = {2, 0}; coordinate[0] >= 0; coordinate[0]--, coordinate[1]++)
            if (currentPlayer != playField[coordinate[0]][coordinate[1]])
                return 0;
        

        return currentPlayer;
    }

}
