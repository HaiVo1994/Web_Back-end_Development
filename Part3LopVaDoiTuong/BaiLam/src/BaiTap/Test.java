package BaiTap;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(15, 11);
        Square square = new Square(10);

        Shape shape = new Shape(square, rectangle, circle);

        System.out.println(shape.toString());
        shape.draw();

        shape.setCircle(15);
        shape.setRectangle(9,18);
        shape.setSquare(18);
        System.out.println(shape.toString());
        shape.draw();
    }
}
