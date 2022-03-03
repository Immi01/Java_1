package at.ImmanuelEhe.basics;

public class Loops2 {

    public static void main(String[] args) {

        int Result = 0;

        for(int i = 2; i < 1000; i = i + 2){
            Result = Result + i;
        }

        System.out.println(Result);

    }

}
