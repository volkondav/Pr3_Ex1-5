package ru.mirea.inbo0219;


public class ShapeTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(3, "желтый", false );
        Rectangle r1 = new Rectangle(2,5);
        Square s1 = new Square(4);

        System.out.println("Circle area: " + c1.getArea());
        System.out.println("Circle perimetr: " + c1.getPerimeter());

        System.out.println("Rectangle area: " + r1.getArea());
        System.out.println("Recrtangle perimetr: " + r1.getPerimeter());

        s1.setSide(5);

        s1.setLength(4);
        s1.setWidth(4);

        System.out.println("Square area: "+ s1.getArea());
        System.out.println("Square perimetr: "+ s1.getPerimeter());

    }
}
