package shapes;


public class Rectangle extends Shape {
    private Point A;
    private Point C;
    public Point getA() {
        return A;
    }
    public Point getC() {
        return C;
    }
    public void setPointA(Point A) {
        this.A = A;
    }
    public void setPointC(Point C) {
        this.C = C;
    }
    private boolean validate(Point A, Point C) {
        if ((A.getX() == C.getX()) || (A.getY() == C.getY())) {
            throw new NullPointerException("Не удалось создать фигуру, т.к. точки х или y лежат на одной прямой");
        }
        else {
            return true;
        }
    }
    public Rectangle() {}
    public Rectangle(Point A, Point C) {
        if (validate(A,C)) {
            this.A = A;
            this.C = C;
        }
        else {System.out.println("создайте фигуру еще раз");}
    }

    public void draw() {
        try {
            System.out.println("Фигура прямоугольник");
            System.out.println("Координаты вершин: точка А: (" + A.getX() + ";" + A.getY() + ") точка С: (" + C.getX() + ";" + C.getY() + ")");
            System.out.println("Площадь прямоугольника: " + getSquare());
            System.out.println("Периметр прямоугольника: " + getPerimeter());
            System.out.println("Цвет прямоугольника: " + getColor());
            System.out.println();
        }
        catch (Exception error) {
            throw new NullPointerException("Фигура не описана до конца");
        }
    }
    public double getSquare(){
        return Math.abs((C.getY() - A.getY()) * (C.getX() - A.getX()));
    }

    public double getPerimeter(){
        return (2* (Math.abs(C.getY() - A.getY()) + Math.abs(C.getX() - A.getX())));
    }

    public void move(double moveX, double moveY) {
        A.setX(A.getX() + moveX);
        A.setY(A.getY() + moveY);
        C.setX(C.getX() + moveX);
        C.setY(C.getY() + moveY);
    }
}
