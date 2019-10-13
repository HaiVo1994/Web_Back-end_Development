public class Bt3GopMang {
    public static int[] castArray(int[]... arr){
        int sum = 0;
        for (int[] element: arr) {
            sum += element.length;
        }
        int[] arrCasted = new int[sum];
        sum = 0;
        for (int[] element: arr) {
            for (int j=0; j<element.length;j++){
                arrCasted[sum] = element[j];
                sum++;
            }
        }
        return arrCasted;
    }

    public static void main(String[] args) {
        int[] a = {2,3,5,6,2,7};
        int[] b = {5,2,72,34,32};
        int[] c = castArray(a,b);
        for (int i=0; i<c.length; i++){
            System.out.print(c[i] + "  ");
        }
    }
}
