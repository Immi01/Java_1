package at.immanuelehe.objektorientierung.rechner.objects;

public class RootCalculator extends Calculator{

    public float root(int base){
        return (float)Math.pow(base, 0.5f);
    }

    public float root(int base, int exponent){
        return (float)Math.pow(base, 1f/(float)exponent);
    }

}
