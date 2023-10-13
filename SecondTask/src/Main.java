import colors.Color;
import shapes.*;
import services.impl.ShapesServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //красный треугольник с координатами (0, 0), (0, 4), (4, 0)
        Triangle triangle = new Triangle(new Point(0,0),new Point(0,4),new Point(4,0));
        triangle.setColor(Color.RED);
        triangle.draw();

        //круг белого цвета с радиусом 2 и центром в точке (3, 3)
        Circle circle = new Circle(new Point(2,2), 2);
        circle.setColor(Color.WHITE);
        circle.setPoint(new Point(3, 3));
        circle.draw();

        //круг желтого цвета с радиусом 4 и центром в точке (2, 5)
        Circle circle2 = new Circle(new Point(2,5), 4);
        circle2.setColor(Color.YELLOW);
        circle2.draw();

        //прямоугольник с координатами (1, 1) и (5, 2)
        Rectangle rectangle = new Rectangle(new Point(1,1),new Point(5,2));
        rectangle.setColor(Color.WHITE);
        rectangle.draw();

        //точка с координатой (100, 100)
        Point point = new Point(99,1);
        point.setColor(Color.BLACK);
        point.setX(100);
        point.setY(100);
        point.draw();

        //синий треугольник с координатами (-2, 3), (4, 3), (2, 5)
        Triangle triangle2 = new Triangle(new Point(-2,3),new Point(4,3),new Point(2,5));
        triangle.setColor(Color.BLUE);
        triangle.draw();

        List<Shape> shapes = new ArrayList();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(circle2);
        shapes.add(rectangle);
        shapes.add(point);
        shapes.add(triangle2);

        System.out.println("Total squares: " + new ShapesServiceImpl().getSquares(shapes));
        System.out.println("Max perimeter: " + new ShapesServiceImpl().getMaxPerimeters(shapes));
        System.out.println("All unique colors: " + new ShapesServiceImpl().getColors(shapes));
    }
}