public class Bt4TimGiaTriNhoNhat {
    public static int finMin(int[] arr){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,2,2,63,7};
        System.out.print(finMin(arr));
    }
}
