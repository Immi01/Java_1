package at.immanuelehe.basics;

import java.util.Random;

public class While1 {

    public static void main(String[] args) {

        Random random = new Random();

        int Result = 0;
        int RandomNum = 0;

        while (RandomNum != 15 && RandomNum != 25){
            RandomNum = random.nextInt(10,30);
            Result = Result + RandomNum;
        }

        System.out.println(Result);

    }

}
