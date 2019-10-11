import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args){
        double money = 1.0;
        int month = 1;
        double intersetRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        intersetRate = input.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (intersetRate/100)/12 * i;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
