package at.immanuelehe.arrays;

public class CrossSum1 {
    public static void main(String[] args) {
        //Gib alle Zahlen zwischen 0 und 1000 aus, welche eine Quersumme von 15 haben.
        //Beispiel: die Quersumme von 253 ist 2 + 5 + 3 = 10

        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp /= 10;
            }
            if (crossSum == 15){
                System.out.println(i);
            }
        }

    }

}
