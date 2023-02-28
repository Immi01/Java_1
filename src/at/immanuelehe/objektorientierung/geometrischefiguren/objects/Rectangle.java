package at.immanuelehe.objektorientierung.geometrischefiguren.objects;

public class Rectangle extends BaseFigure{

    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public float getArea() throws Exception {
        return a*b;
    }

}
