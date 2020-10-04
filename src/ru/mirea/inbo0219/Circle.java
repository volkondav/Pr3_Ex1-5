package ru.mirea.inbo0219;

public class Circle extends Shape{

    protected double radius;

    public Circle(){
        this.color = "Не задано";
        this.filled = false;
        this.radius = 0;

    }
    public Circle(double radius){
        this.color = "Не задано";
        this.filled = false;
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        System.out.printf("Радиус до " + this.radius );
        this.radius = radius;
        System.out.println("Радиус после "+this.radius);
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;    }
}
