import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    private double getDiscriminant(){
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }
    public double getRoot1(){
        double discriminant = this.getDiscriminant();
        if (discriminant>=0){
            return  ((-this.b + Math.sqrt(discriminant)) / (2 * this.a));
        }
        return Double.NaN;
    }

    public double getRoot2(){
        double discriminant = this.getDiscriminant();
        if (discriminant>=0){
            return  ((-this.b - Math.sqrt(discriminant)) / (2 * this.a));
        }
        return Double.NaN;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quadratic Equation");
        System.out.print("Enter a:");
        int a = input.nextInt();
        System.out.print("\nEnter b:");
        int b = input.nextInt();
        System.out.print("\nEnter c:");
        int c = input.nextInt();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Quadratic Equation root 1 = " + equation.getRoot1());
        System.out.println("Quadratic Equation root 2 = " + equation.getRoot2());
    }
}
