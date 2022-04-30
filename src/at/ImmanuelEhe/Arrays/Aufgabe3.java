package at.ImmanuelEhe.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe3 {

    public static void main(String[] args) {

        /*
        Sortiere ein Array mit Zahlen nach deren Wert.

        Eingabe: [8, 3, 2, 22, 8, 1]Ausgabe: [1, 2, 3, 8, 8, 22]

        Tip: Suche im Array die kleinste Zahl. In einem zweiten Array fügst du die Zahl dann ganz vorne ein...etc.

        Hinweis - es gibt unzählige Möglichkeiten Daten zu sortieren -
        vielleicht kannst Du die Sortierung noch auf eine andere Art durchführen.
         */

        int[] nums = {8, 3, 2, 22, 8, 1};

        /*code testing "things" from here to-----------------

        long timeAtStart = System.nanoTime();

        Random random = new Random();
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(0,1000);
            //System.out.println(nums[i]);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        ---------------------------------------------- here*/

        boolean[] toSort = new boolean[nums.length];
        Arrays.fill(toSort, true);
        toSort[toSort.length - 1] = false;

        int temp = 0;

        boolean sorted = false;

        while(!sorted){

            for (int i = 0; i < nums.length; i++) {

                if(toSort[i]) {
                    if (nums[i] > nums[i + 1]) {
                        temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        if(i != 0)
                            toSort[i - 1] = true;
                        else
                            toSort[i] = true;
                    } else {
                        toSort[i] = false;
                    }
                }

            }

            if (allFalse(toSort))
                sorted = true;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        /*long deltaTime = System.nanoTime() - timeAtStart;
        System.out.println(deltaTime);      some code to check the time it took to execute the program*/


    }

    public static boolean allFalse(boolean[] toSort){
        for (int i = 0; i < toSort.length; i++){
            if (toSort[i]) return false;
        }
        return  true;
    }

}
