package at.immanuelehe.objektorientierung.geometrischefiguren;

import at.immanuelehe.objektorientierung.geometrischefiguren.objects.Circle;
import at.immanuelehe.objektorientierung.geometrischefiguren.objects.Dice;
import at.immanuelehe.objektorientierung.geometrischefiguren.objects.Rectangle;
import at.immanuelehe.objektorientierung.geometrischefiguren.objects.Square;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Kreis", 3);
        Dice dice = new Dice("Würfel", 4);
        Rectangle rectangle = new Rectangle("Rechteck", 6, 9);
        Square square = new Square("Quadrat", 2);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getName());
        System.out.println(dice.getArea());
        System.out.println(square.getName());

    }

}
