package shapes;

public class Triangle extends Shape {
    private Point A;
    private Point B;
    private Point C;

    public Point getA() {
        return A;
    }
<<<<<<< HEAD
    public void setA(Point A) {
        this.A = A;
    }
    public Point getB() {
        return B;
    }
    public void setB(Point B) {
        this.B = B;
    }
    public Point getC() {
        return C;
    }
    public void setC(Point C) {
        this.C = C;
    }
    private boolean validate(Point A, Point B, Point C) {
        if (((A.getX() == C.getX()) || (A.getY() == C.getY())) && ((A.getX() == B.getX()) || (A.getY() == B.getY())) && ((B.getX() == C.getX()) || (B.getY() == C.getY()))) {
            return false;
        }
        else {
            return true;
        }
    }
=======

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }

>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public Triangle(Point A, Point B, Point C) {
        if (validate(A, B, C)) {
            this.A = A;
            this.B = B;
            this.C = C;
        }
<<<<<<< HEAD
        else {
            throw new NullPointerException("Не удалось создать фигуру, т.к. точки лежат на одной прямой, cоздайте фигуру заново");
        }
=======
>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    }
    public Triangle() {

    }
<<<<<<< HEAD
=======
    private boolean validate(Point A, Point B, Point C) {
        if (((A.getX() == C.getX()) || (A.getY() == C.getY())) && ((A.getX() == B.getX()) || (A.getY() == B.getY())) && ((B.getX() == C.getX()) || (B.getY() == C.getY()))) {
            throw new NullPointerException("Точки х или y лежат на одной прямой");
        }
        else {
            return true;
        }
    }
>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public double getSquare() {
        double AB = distance(A, B);
        double BC = distance(B, C);
        double CA = distance(C, A);
        double k = (AB + BC + CA) / 2.0;
        return Math.sqrt(k * (k - AB) * (k - BC) * (k - CA));
    }

    public double getPerimeter() {
        return distance(A, B) + distance(B, C) + distance(C, A);
    }

    private double distance(Point p1, Point p2) {
        double deltaX = p1.getX() - p2.getX();
        double deltaY = p1.getY() - p2.getY();

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void move(double moveX, double moveY) {
        A.setX(A.getX() + moveX);
        A.setY(A.getY() + moveY);
        C.setX(C.getX() + moveX);
        C.setY(C.getY() + moveY);
        B.setX(B.getX() + moveX);
        B.setY(B.getY() + moveY);
    }
    public void draw() {
        try {
            System.out.println("Фигура треугольник");
            System.out.println("Координаты вершин: точка А: (" + A.getX() + ";" + A.getY() + ") точка B: (" + B.getX() + ";" + B.getY() + ") точка С: (" + C.getX() + ";" + C.getY() + ")");
            System.out.println("Площадь треугольника: " + getSquare());
            System.out.println("Периметр треугольника: " + getPerimeter());
            System.out.println("Цвет треугольника: " + getColor());
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
}
