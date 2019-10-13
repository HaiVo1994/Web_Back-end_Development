public class Bt6TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        int length = 10;
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
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                matrix[row][column] = (int) (Math.random() * 10);
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
