package at.immanuelehe.objektorientierung.geometrischefiguren.objects;

public class Square extends BaseFigure {

    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public float getArea() throws Exception {
        return a*a;
    }
}
