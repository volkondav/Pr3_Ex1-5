package ru.mirea.inbo0219;

public  class Rectangle extends Shape {
    protected double width;
    protected  double length;

    public Rectangle(){
        this.color = "Не задано";
        this.filled = false;
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length){
        this.color = "Не задано";
        this.filled = false;
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getArea() {
        return width * length;
    }

    double getPerimeter() {
        return 2*(width+length);
    }


    public String toString() {
        return "Shape: Rectangle," + "width " + width + "length " + length + "color " + color;
    }

}
