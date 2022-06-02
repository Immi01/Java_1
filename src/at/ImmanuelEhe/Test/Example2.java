package at.ImmanuelEhe.Test;

import java.util.Random;

public class Example2 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = 0;
        int sum = 0;

        while (randomNum != 5){
            randomNum = random.nextInt(0,10);
            sum += randomNum;
        }
        System.out.println(sum);
    }

}
