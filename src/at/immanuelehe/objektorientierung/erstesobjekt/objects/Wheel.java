package at.immanuelehe.objektorientierung.erstesobjekt.objects;

public class Wheel {

    public enum Condition {GOOD, BAD, OK};
    private int width;
    private int height;
    private Condition condition;

    public Wheel(int width, int height, Condition condition) {
        this.width = width;
        this.height = height;
        this.condition = condition;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
