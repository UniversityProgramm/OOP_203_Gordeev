package shapes;

public class Point extends Shape {
    private double x = 0.0;
    private double y = 0.0;

    public double getX() {
        return x;
    }
<<<<<<< HEAD
    public void setX(double x) {
        this.x = x;
    }
    public double getY(){
        return y;
    }
=======

    public void setX(double x) {
        this.x = x;
    }

    public double getY(){
        return y;
    }

>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public void setY(double y) {
        this.y = y;
    }

    public Point() {}
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
<<<<<<< HEAD
=======

>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public void draw() {
        try {
            System.out.println("Фигура точка");
            System.out.println("Координаты точки: " + x + " " + y);
            System.out.println("Цвет точки: " + getColor());
            System.out.println();
        }
        catch (Exception error) {
<<<<<<< HEAD
            throw new NullPointerException("Не все данные определены");
=======
            throw new NullPointerException("Фигура не описана до конца");
>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
        }
    }
    public double getSquare(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }

    public void move(double moveX, double moveY) {
        x += moveX;
        y += moveY;
    }
}
