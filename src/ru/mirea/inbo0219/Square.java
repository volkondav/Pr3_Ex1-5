package ru.mirea.inbo0219;

public class Square extends Rectangle {
    private double side;

    public Square(){
        this.color = "Не задано";
        this.filled = false;
        this.width = 0;
        this.length = 0;
    }
    public Square (double side){
        this.color = "Не задано";
        this.filled = false;
        this.width = 0;
        this.length = 0;
        this.side = side;
    }
    public Square(double side,String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = 0;
        this.length = 0;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        System.out.println("Длина стороны до "+ this.side);
        this.side = side;
        System.out.println("Длина стороны после "+ this.side);
    }

    public void setWidth(double side) {
        super.setWidth(this.side);//------ почему здесь нельзя использовать this?
    }

    public void setLength(double side){
        super.setLength(this.side);
    }

    public String toString() {
        return "Shape: Square, " + "side "+ side + " color " + color;
    }
}
