package shapes;

import colors.Color;
public abstract class Shape {
    private Color color = Color.TRANSPARENT;
    public String shapeType;
    public double width;
    public double height;
    public double radius;
    private double area;
    private double perimeter;
    public Color getColor() {
        return color;
    }
    public void setColor(Color inputColor) {
        color = inputColor;
    }
    public double getArea () {
        if (this.shapeType == "Circle") {
            area = Math.PI * this.radius * this.radius;
            return area;
        }
        else if (this.shapeType == "Triangle") {
            return 0.0;
        }
        else if (this.shapeType == "Rectangle") {
            area = width * height;
            return area;
        }
        else if (this.shapeType == "Point") {
            area = 0.0;
            return area;
        }
        return 0.0;
    }
    public double getPerimeter () {
        if (this.shapeType == "Circle") {
            area = Math.PI * this.radius * this.radius;
            return perimeter;
        }
        else if (this.shapeType == "Triangle") {
            return 0.0;
        }
        else if (this.shapeType == "Rectangle") {
            area = width * height;
            return perimeter;
        }
        else if (this.shapeType == "Point") {
            area = 0.0;
            return perimeter;
        }
        return 0.0;
    }
    public void move(double moveX, double moveY) {

    }
    public void draw() {

    }
}