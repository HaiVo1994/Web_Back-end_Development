package BaiTap;

public class Rectangle {
    private double width = 0;
    private double height = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width;
    }
    public void draw(){
        for (int i=0; i<this.height; i++){
            for (int j=0; j<this.width; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
