public class Bt5XoaPhanTu {
    public static void deleteElement(int[] arr, int location){
        if ((location>=0) && (location<arr.length)){
            arr[location] = 0;
            for (int i=location; i<arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,42,5,2,62,23,2};
        deleteElement(arr,4);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}
