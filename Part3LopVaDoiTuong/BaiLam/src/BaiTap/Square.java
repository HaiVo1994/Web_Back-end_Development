package BaiTap;

public class Square {
    private double side = 0;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return Math.pow(this.side, 2);
    }
    public void draw(){
        for (int i=0; i<this.side; i++){
            for (int j=0; j<this.side; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
