package ru.mirea.inbo0219;


import java.awt.*;

public class ShapeTest {
    public static void main(String[] args) {

        System.out.println("----------------------- Задание №1-3 ----------------------------------------------------");


        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); //which version?---------------------------------------------- 5.5 RED 0
        System.out.println(s1.getArea()); //which version?------------------------------------ ~95
        System.out.println(s1.getPerimeter()); //which version?------------------------------- ~34,6
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());//------------------------------у абстарктного класса нет данного метода
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());//------------------здесь уже есть данный метод, тк класс имеет данный метод
        //Shape s2 = new Shape(); //--------------------------------нельзя создавать объекты на основе абстракного класс
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());//------------------------------у абстарктного класса нет данного метода
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());//------------------здесь уже есть данный метод, тк класс имеет данный метод
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());//------------------------------у абстарктного класса нет данного метода



// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());//-----------------------у класса Rectangle нет данного метода,
                                           //----------------------- пусть даже мы объекту передали объект класса Square
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());//------------------здесь уже есть данный метод, тк класс имеет данный метод
        System.out.println(sq1.getLength());



        ///////////////////////////////////////////////////////ЗАДАНИЕ 4

        System.out.println("----------------------- Задание №4 ------------------------------------------------------");


        Movable p1 = new MovablePoint(2, 4, 5, 5);
        System.out.println(p1.toString());
        p1.moveUp();
        p1.moveRight();
        System.out.println(p1.toString());

        MovablePoint p2 = (MovablePoint) p1;
        System.out.println(p2.toString());


        Movable m_c1 = new MovableCircle(1,2,5,5,10);

        System.out.println(m_c1.toString());
        m_c1.moveRight();
        m_c1.moveUp();
        System.out.println(m_c1.toString());

        /////////////////////////////////////////////////////ЗАДАНИЕ 5

        System.out.println("------------------------- Задание №5 ----------------------------------------------------");

        MovableRectangle m_r1 = new MovableRectangle(1,2,3,4,5,6);
        System.out.println(m_r1.toString());
        m_r1.speedPoints();
        System.out.println(m_r1.toString());
        m_r1.moveUp();
        m_r1.moveRight();
        System.out.println(m_r1.toString());
    }
}
