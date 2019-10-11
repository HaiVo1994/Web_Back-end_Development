import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] test) {
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Menu: ");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:{
                        System.out.println("Draw the rectangle");
                        System.out.println("Input width: ");
                        int width = input.nextInt();
                        System.out.println("Input height: ");
                        int height = input.nextInt();
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                    }
                    break;
                case 2: {
                        System.out.println("Draw the square triangle");
                        System.out.println("Input edge of square triangle: ");
                        int edge = input.nextInt();
                        System.out.println("Bottom-left square triangle: ");
                        for (int i = 0; i < edge; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.println("Top-left square triangle: ");
                        for (int i = 0; i < edge; i++) {
                            for (int j = 0; j < edge - i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.println("Top-right square triangle: ");
                        for (int i = 0; i < edge; i++) {
                            for (int k = 0; k<i; k++){
                                System.out.print(" ");
                            }
                            for (int j = 0; j < edge - i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.println("Bottom-right square triangle: ");
                        for (int i = 0; i < edge; i++) {
                            for (int k = edge; k>i; k--){
                                System.out.print(" ");
                            }
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                    }
                    break;
                case 3: {
                        System.out.println("Draw isosceles triangle");
                        System.out.println("Input height of square triangle: ");
                        int height = input.nextInt();
                        for (int i= 0; i<height; i++){
                            for (int j=0; j<height - i;j++){
                                System.out.print(" ");
                            }
                            for (int k=0; k<2*i+1; k++){
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }while (choice!=0);
    }
}
