package ru.mirea.inbo0219;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    public void speedPoints() {
        if (topLeft.xSpeed != bottomRight.xSpeed) {
            System.out.println("Скорости прямоугольника по горизонтали не совпадают, поэтому они будут приравнены");
            topLeft.xSpeed = bottomRight.xSpeed;
        }
        else {
            System.out.println("Скорости прямоугольника по горизонтали совпадают");
        }
        if (topLeft.ySpeed != bottomRight.ySpeed){
            System.out.println("Скорости прямоугольника по вертикали не совпадают, поэтому они будут приравнены");
            topLeft.ySpeed = bottomRight.ySpeed;
        }
        else {
            System.out.println("Скорости прямоугольника по вертикали совпадаю");
        }
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.x;
        bottomRight.x -= bottomRight.x;
    }

    @Override
    public void moveRight() {
        topLeft.x -= topLeft.x;
        bottomRight.x -= bottomRight.x;
    }

    @Override
    public String toString() {
        return "Rectangle: \n topLeft x: " + topLeft.x + " и y: "+ topLeft.y
                + "\n bottomRight x: "+ bottomRight.x + " и y: "+ bottomRight.y;
    }
}
