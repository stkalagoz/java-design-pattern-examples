package FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        String CIRCLE = "CIRCLE";
        String SQUARE = "SQUARE";
        String RECTANGLE = "RECTANGLE";

        Shape circleShape =  shapeFactory.getShape(CIRCLE);
        circleShape.draw();

        Shape squareShape = shapeFactory.getShape(SQUARE);
        squareShape.draw();

        Shape rectangleShape = shapeFactory.getShape(RECTANGLE);
        rectangleShape.draw();
    }
}
