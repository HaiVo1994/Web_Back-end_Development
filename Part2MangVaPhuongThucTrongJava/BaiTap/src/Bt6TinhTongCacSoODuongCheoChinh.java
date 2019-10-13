import java.util.Scanner;

public class Bt6TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        int length = 0;
        Scanner enter = new Scanner(System.in);
        do{
            System.out.print("Input matrix size: ");
            length = enter.nextInt();
        }while ((length<0) || (length>20));
        int[][] arr = createSquareMatrix(length);
        for (int i=0; i<length; i++){
            for (int j=0; j<length; j++){
                System.out.print(arr[i][j] + "  ");
            }
                System.out.print("\n");
        }
        System.out.print("Sum matrix: " + plusCrossMatrix(arr,length));
    }

    public static int[][] createSquareMatrix(int length){
        int[][] matrix = new int[length][length];
        Scanner enter = new Scanner(System.in);
        for (int i=0; i<length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("Input matrix [" + i + "][" + j + "]: ");
                matrix[i][j] = enter.nextInt();
            }
        }
        return  matrix;
    }
    public static int plusCrossMatrix(int[][] matrix, int length){
        int sum = 0;
        for (int i=0; i<length; i++){
            sum += matrix[i][i];
        }
        return sum;
    }
}
