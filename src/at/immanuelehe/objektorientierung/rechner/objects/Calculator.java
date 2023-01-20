package at.immanuelehe.objektorientierung.rechner.objects;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(int dividend, int divisor) {
        return (float)dividend / (float)divisor;
    }

}
