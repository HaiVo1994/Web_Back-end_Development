public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return this.height * super.getArea();
    }

    @Override
    public String toString(){
        return super.toString() + " height = " + this.height;
    }
}
