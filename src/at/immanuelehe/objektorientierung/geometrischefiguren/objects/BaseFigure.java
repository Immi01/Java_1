package at.immanuelehe.objektorientierung.geometrischefiguren.objects;

public class BaseFigure {

    private String name;

    public BaseFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getArea() throws Exception {
        throw new Exception("The Base Figure doesn't have an area");
    }

}
