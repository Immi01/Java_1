package at.immanuelehe.objektorientierung.rechner;

import at.immanuelehe.objektorientierung.rechner.objects.Calculator;
import at.immanuelehe.objektorientierung.rechner.objects.RootCalculator;
import at.immanuelehe.objektorientierung.rechner.objects.ScientificCalculator;

public class Main {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(3,7));
        System.out.println(c1.divide(4,6));

        ScientificCalculator c2 = new ScientificCalculator();
        System.out.println(c2.sin(2));
        System.out.println(c2.add(5,5));

        RootCalculator c3 = new RootCalculator();
        System.out.println(c3.root(6));
        System.out.println(c3.subtract(5,7));
    }

}
