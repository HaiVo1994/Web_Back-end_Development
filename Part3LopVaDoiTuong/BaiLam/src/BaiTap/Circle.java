package BaiTap;

public class Circle {
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return  this.getRadiusSquare() * Math.PI;
    }
    private double getRadiusSquare(){
        return Math.pow(radius, 2);
    }
    public void draw(){
        double check;
        double radiusSquare = this.getRadiusSquare();
        long limit = Math.round(radius) + 1;
        for (long i=-limit; i<limit; i++){
            for (long j=-limit; j<limit; j++){
                check = Math.pow(i,2) + Math.pow(j,2);
                if (check <= radiusSquare)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
