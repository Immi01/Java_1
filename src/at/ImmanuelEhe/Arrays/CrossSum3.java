package at.ImmanuelEhe.Arrays;

public class CrossSum3 {

    public static int[] CrossSums = new int[CrossSumCalculation(false) + 1];

    public static void main(String[] args) {
        //Welche der Quersummen bei den Zahlen von 0 - 1000 kommt am häufigsten vor? Gib diese aus.

        CrossSumCalculation(true);
        int highestCrossSum1 = 0;
        int highestCrossSum2 = 0;
        int highestEmergence = 0;

        for (int i = 0; i < CrossSums.length; i++){
            if (CrossSums[i] == highestEmergence)
                highestCrossSum2 = i;
            if (CrossSums[i] > highestEmergence) {
                highestCrossSum1 = i;
                highestEmergence = CrossSums[i];
            }
            //System.out.println(i + ": " + CrossSums[i]);
        }

        System.out.println();
        if (highestCrossSum1 == highestCrossSum2 || highestCrossSum2 == 0)
            System.out.println("Highest Cross Sum: " + highestCrossSum1);
        else
            System.out.println("Highest Cross Sums: " + highestCrossSum1 + ", " + highestCrossSum2);
        System.out.println("Highest Emergence: " + highestEmergence);
    }

    public static int CrossSumCalculation(boolean secondTry){
        int highestCrossSum = 0;
        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp /= 10;
            }
            if(crossSum > highestCrossSum) highestCrossSum = crossSum;
            if(secondTry) CrossSums[crossSum]++;
        }
        return highestCrossSum;
    }

}
