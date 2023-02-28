package at.immanuelehe.objektorientierung.geometrischefiguren.objects;

public class Dice extends BaseFigure{

    private int a;

    public Dice(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public float getArea() {
        return a*a*a;
    }
}
