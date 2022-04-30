package at.ImmanuelEhe.Arrays;

public class Aufgabe1 {

    public static void main(String[] args) {

        //Erstelle ein Array von 10 ganzen Zahlen.
        //Gehe das Array in einem Loop durch und berechne die Summe!

        int[] Numbers = {345, 6 , 9, 20, 8, 63, 3, 99, 25, 44};
        int sum = 0;

        for (int i = 0; i < Numbers.length; i++){
            sum += Numbers[i];
        }

        System.out.println(sum);

    }

}
