package BaiTap;

public class Shape {
    private Square square;
    private Rectangle rectangle;
    private Circle circle;

    private static final String circleAlert = "\nThis circle area = ";
    private static final String rectangleAlert = "\nThis rectangle area = ";
    private static final String squareAlert = "\nThis Square area = ";

    public Shape(Square square, Rectangle rectangle, Circle circle) {
        this.square = square;
        this.rectangle = rectangle;
        this.circle = circle;
    }

    public void setSquare(double side) {
        this.square.setSide(side);
    }

    public void setRectangle(double width, double height) {
        this.rectangle.setHeight(height);
        this.rectangle.setWidth(width);
    }

    public void setCircle(double radius) {
        this.circle.setRadius(radius);
    }
    @Override
    public String toString(){
        return circleAlert + circle.getArea() + squareAlert + square.getArea() + rectangleAlert + rectangle.getArea();
    }

    public void draw(){
        System.out.println("Circle");
        circle.draw();
        System.out.println("Rectangle");
        rectangle.draw();
        System.out.println("Square");
        square.draw();
    }
}
