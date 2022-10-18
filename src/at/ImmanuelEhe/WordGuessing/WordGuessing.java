package at.ImmanuelEhe.WordGuessing;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class WordGuessing {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] Words = {"Heizöl", "rückstoß", "abdämpfung", "Lokomotive", "Fass", "Kirschkern", "Recycling"};
        String letters = "qwertzuiopüasdfghjklöäyxcvbnmQWERTZUIOPÜASDFGHJKLÖÄYXCVBNM";
        boolean hasCompleted = false;
        String[] countingWords = {"null", "ein", "zwei", "drei", "vier"};


        System.out.println("**************");
        System.out.println("Wörter raten");
        System.out.println("Sie können hier die Buchstaben der Wörter erraten");
        System.out.println("Geben sie einfach einen Buchstaben ein");
        System.out.println("um zu sehen ob er im Wort enthalten ist.");
        System.out.println();
        System.out.println("Wenn ein Buchstabe anfangs schon angezeigt wurde,");
        System.out.println("kann er trotzdem noch versteckt sein.");
        System.out.println();
        System.out.println("**************");
        System.out.println();

        while(true){

            int chosenWord = random.nextInt(0, Words.length - 1);

            char[] toGuess = Words[chosenWord].toCharArray();
            char[] shownLetters = Words[chosenWord].toCharArray();
            int hiddenLetters = 0;


            for (int i = 0; i < shownLetters.length; i++)
                if(random.nextInt() > 0.75) {
                    shownLetters[i] = '*';
                    hiddenLetters++;
                } else
                    toGuess[i] = '*';


            while (!hasCompleted) {

                char charInput = ' ';

                for (char shownLetter : shownLetters)
                    System.out.print(shownLetter);

                System.out.println();
                System.out.println("Geben sie einen Buchstaben, der im Wort vorkommen könnte ein:");


                while (charInput == ' ') {
                    String input = scanner.nextLine();
                    if (input.equals("")) {
                        System.out.println("Die Eingabe darf nicht leer sein.");
                        continue;
                    }
                    charInput = input.charAt(0);
                    String singleCharInput = String.valueOf(charInput);

                    if (!letters.contains(singleCharInput)) {
                        System.out.println("Bitte geben Sie einen Buchstaben des Deutschen Alphabets ein.");
                        charInput = ' ';
                    }
                    if (input.length() > 1) {
                        System.out.println("Nur der Erste Buchstabe wird benutzt");
                        charInput = ' ';
                    }

                }


                int prevHiddenLetters = hiddenLetters;

                for (int i = 0; i < toGuess.length; i++) {
                    if (Character.toLowerCase(charInput) == toGuess[i] || Character.toUpperCase(charInput) == toGuess[i]) {
                        shownLetters[i] = toGuess[i];
                        hiddenLetters--;
                    }
                }

                System.out.printf("%c wurde %s-mal im Wort gefunden.%n%n", charInput, countingWords[prevHiddenLetters-hiddenLetters]);

                if(hiddenLetters == 0) {
                    System.out.print("Das gesuchte Wort war ");
                    for (char shownLetter : shownLetters)
                        System.out.print(shownLetter);
                    System.out.println(".");
                    System.out.println("Das Spiel wird sich jetzt wieder neu starten.");
                    System.out.printf("**************%n%n%n");
                    hasCompleted = true;
                }

            }

            hasCompleted = false;

        }

    }

}
