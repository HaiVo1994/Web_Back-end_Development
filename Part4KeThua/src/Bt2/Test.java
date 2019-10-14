package Bt2;

public class Test {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(12,13);
        Point3D p3d = new Point3D(11,14,15);
        System.out.println("2 D: " + p2d.toString());
        System.out.println("3 D: " + p3d.toString());
        p2d.setXY(15,16);
        System.out.println("2 D: " + p2d.toString());
        p3d.setXYZ(12,55,12);
        System.out.println("3 D: " + p3d.toString());
    }
}
