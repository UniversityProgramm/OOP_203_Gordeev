package shapes;
import colors.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;
    private double square = 0;
<<<<<<< HEAD
    private double perimeter = 0;
=======
    private double flat = 0;
>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f

    public Color getColor() {
        return color;
    }
<<<<<<< HEAD
    public void setColor(Color color) {
        this.color = color;
    }
    public double getSquare() {
        return square;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void move(double moveX,double moveY) {}
    public void draw() {}
=======

    public void setColor(Color color) {
        this.color = color;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return flat;
    }

    public void move(double moveX,double moveY) {}

    public void draw() {}

>>>>>>> 036102f92901456feda2d816e3b1c4f1fab9d31f
    public void setPoint() {}
}

