package Bt2InterfaceColorable;

public class Square extends Shape implements Colorable {
    private double side = 1;
    private String color = "Green";
    private boolean filled = true;
    public Square() {
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
