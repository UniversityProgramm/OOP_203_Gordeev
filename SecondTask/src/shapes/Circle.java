package shapes;

public class Circle extends Shape{
    private Point point;
    private  double radius;

    public Circle(){}

    public Circle(Point point, double radius) {
        validate(radius);
        this.point = point;
        this.radius = radius;
    }
<<<<<<< HEAD
    public Point getPoint(){
        return this.point;
    }
    public void setPoint(Point point) {
        this.point = point;
    }
    public double getRadius() {
        return radius;
    }
=======

    public Point getPoint(){
        return this.point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public void setRadius(double radius) {
        if (validate(radius)) {
            this.radius = radius;
        }
    }
    private boolean validate(double radius) {
        if (radius <= 0) {
<<<<<<< HEAD
            throw new NullPointerException("Радиус не может быть меньше 0");
        }
        return true;
    }
=======
            throw new NullPointerException("Radius can't be less than 0");
        }
        return true;
    }

>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public void draw() {
        try {
            System.out.println("Фигура круг");
            System.out.println("Центр круга: " + "(x = " + point.getX() + "; y = " + point.getY() + ")");
            System.out.println("Радиус круга: " + radius);
            System.out.println("Площадь круга: " + getSquare());
            System.out.println("Периметр круга: " + getPerimeter());
            System.out.println("Цвет круга: " + getColor());
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
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void move(double moveX, double moveY) {
        point.setX(point.getX() + moveX);
        point.setY(point.getY() + moveY);
    }
}
