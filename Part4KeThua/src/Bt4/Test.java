package Bt4;

public class Test {
    public static void main(String[] args) {
        Triangle tg = new Triangle("Red", true, 12,15,16);
        System.out.println(tg.toString());
        System.out.println("Perimeter = " + tg.getPerimeter());
        System.out.println("Area = " + tg.getArea());
    }
}
