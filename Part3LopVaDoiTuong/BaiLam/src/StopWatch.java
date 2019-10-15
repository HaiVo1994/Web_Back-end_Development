import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];
        System.out.println("Mang truoc khi sap xep: ");
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n");

        StopWatch time = new StopWatch();
        time.start();
        int count = 0;
        int transfer, minIndex;
        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (i != minIndex) {
                transfer = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = transfer;
            }
        }
        time.stop();
        System.out.println("\nMang sau khi sap xep: " + count*4);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\n");
        System.out.println("\nThoi gian thuc hien: " + time.getElapsedTime() + " ms ");
    }
}
