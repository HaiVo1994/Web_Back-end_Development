package Bt3;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(12,4);
        MovablePoint mvPoint = new MovablePoint(12, 5, 12, 11);
        System.out.println("Point : " + point.toString());
        System.out.println("Movable :" + mvPoint.toString());

        point.setXY(12,5);
        mvPoint.setSpeed(44,23);
        System.out.println("Point : " + point.toString());
        System.out.println("Movable :" + mvPoint.toString());

        mvPoint.move();
        System.out.println("Movable :" + mvPoint.toString());
    }
}
