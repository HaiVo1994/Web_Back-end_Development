package Bt1InterfaceResizeable;

public class TestResizeable {
    public static void main(String[] args) {
        int length = 3;
        Circle[] circles = new Circle[length];
        Rectangle[] rectangles = new Rectangle[length];
        Square[] squares = new Square[length];
        System.out.println("Before resize:");
        for (int i=0; i<length; i++){
            circles[i] = new Circle(Math.random()*length);
            rectangles[i] = new Rectangle(Math.random()*length, Math.random()*length);
            squares[i] = new Square(Math.random()*length);
            System.out.println(circles[i].toString());
            System.out.println(rectangles[i].toString());
            System.out.println(squares[i].toString());
        }
        System.out.println("After resize:");
        for (int i=0; i<length; i++){
            circles[i].resize(Math.random());
            rectangles[i].resize(Math.random());
            squares[i].resize(Math.random());
            System.out.println(circles[i].toString());
            System.out.println(rectangles[i].toString());
            System.out.println(squares[i].toString());
        }
    }
}
