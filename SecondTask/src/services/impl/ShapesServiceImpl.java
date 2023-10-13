package services.impl;

import colors.Color;
import services.ShapesService;
import shapes.Shape;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesServiceImpl implements ShapesService {
    public double getSquares(List<Shape> shapeList) {
        double SquaresSum = 0;
        for(int i = 0; i < shapeList.size(); i++){
            SquaresSum += shapeList.get(i).getSquare();
        }
        return SquaresSum;
    }

    public double getMaxPerimeters(List<Shape> shapeList) {
        double maxFlat = 0;
        for(int i = 0; i < shapeList.size(); i++){
            if (shapeList.get(i).getPerimeter() > maxFlat){
                maxFlat = shapeList.get(i).getPerimeter();
            }
        }
        return maxFlat;
    }

    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> uniqueColors = new HashSet<>();
        for(int i = 0; i < shapeList.size(); i++){
            uniqueColors.add(shapeList.get(i).getColor());
        }
        return uniqueColors;
    }
}
