package shapes;

public class Point extends Shape {
    private double x = 0.0;
    private double y = 0.0;

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public Point() {}
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public void draw() {
        try {
            System.out.println("Фигура точка");
            System.out.println("Координаты точки: " + x + " " + y);
            System.out.println("Цвет точки: " + getColor());
            System.out.println();
        }
        catch (Exception error) {
            throw new NullPointerException("Не все данные определены");
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
