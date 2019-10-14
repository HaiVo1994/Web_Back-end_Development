import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        int length = 100000;
        int[] arr = new int[length];
        System.out.println("Mang truoc khi sap xep: ");
        for (int i=0; i<length; i++){
            arr[i] = (int) (Math.random() * 10000);
            System.out.print(arr[i] + "  ");
        }

        StopWatch time = new StopWatch();
        for (int i=0; i<length-1; i++){
            int max = i;
            for (int j=i+1; j<length; j++){
                if (arr[max] < arr[j])
                    max = j;
            }
            if (i!=max){
                int transfer = arr[i];
                arr[i] = arr[max];
                arr[max] = transfer;
            }
        }
        time.stop();
        System.out.println("\nMang sau khi sap xep: ");
        for (int i=0; i<length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nThoi gian thuc hien: " + time.getElapsedTime() + " ms ");
    }
}
