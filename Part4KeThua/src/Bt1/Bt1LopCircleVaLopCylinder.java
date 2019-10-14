package Bt1;

public class Bt1LopCircleVaLopCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "White");
        Cylinder cylinder = new Cylinder(15, "Black", 10);

        System.out.println("This circle " + circle.toString() + " area = " + circle.getArea());
        System.out.println("This cylinder " + cylinder.toString() + " volume = " + cylinder.getVolume());

        circle.setRadius(15);
        cylinder.setHeight(55);
        System.out.println("This circle " + circle.toString() + " area = " + circle.getArea());
        System.out.println("This cylinder " + cylinder.toString() + " volume = " + cylinder.getVolume());
    }
}
