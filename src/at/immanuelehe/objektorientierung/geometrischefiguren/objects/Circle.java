package at.immanuelehe.objektorientierung.geometrischefiguren.objects;

public class Circle extends BaseFigure {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public float getArea(){
        return (float) Math.PI * radius * 2f;
    }

}
