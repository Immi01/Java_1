package at.ImmanuelEhe.Test;

import java.util.Random;

public class Example1 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNum1 = random.nextInt(0, 1000);
        int randomNum2 = random.nextInt(0, 1000);

        if (randomNum1 < randomNum2){
            int tmp = randomNum1;
            randomNum1 = randomNum2;
            randomNum2 = tmp;
        }

        for (int i = randomNum1; i >= randomNum2; i--)
            System.out.println(i);

    }

}
