import java.util.Scanner;

public class Bt7TinhTongMotCot {
    public static int[][] creteMatrix(int width, int height){
        int[][] arr = new int[height][width];
        Scanner enter = new Scanner(System.in);
        for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Input matrix [" + i + "][" + j + "]: ");
                arr[i][j] = enter.nextInt();
            }
        }
        return arr;
    }

    public static int plusPillar(int[][] arr, int location){
        int length = arr.length;
        int sum = 0;
        for (int i=0; i<length; i++){
            sum += arr[i][location];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width;
        do{
            System.out.print("Input matrix width: ");
            width = input.nextInt();
        }while ((width<0) || (width>20));
        int height;
        do{
            System.out.print("Input matrix height: ");
            height = input.nextInt();
        }while ((height<0) || (height>20));
        int[][] matrix = creteMatrix(width,height);
        for (int i=0; i<height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.print("\n");
        }
        int location = 0;
        do{
            System.out.print("Input number pillar: ");
            location = input.nextInt();
        }while ((location<0) || (location>width));
        System.out.print("Sum pillar " + location + " is: " + plusPillar(matrix, location));
    }
}
