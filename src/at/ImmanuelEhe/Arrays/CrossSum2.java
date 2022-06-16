package at.ImmanuelEhe.Arrays;

public class CrossSum2 {
    public static void main(String[] args) {
        //Gib alle Zahlen zwischen 0 und 1000 aus, bei welchen die Quersumme ein vielfaches von 7 ist.
        //Beispiel: wenn die Quersumme 49 ergibt, ist dies 7 mal durch 7 teilbar

        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp /= 10;
            }
            if (crossSum % 7 == 0){
                System.out.println(i);
            }
        }

    }
}
