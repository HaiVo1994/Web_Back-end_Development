import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Nhap so tien usd: ");
        Scanner input = new Scanner(System.in);
        float usd = input.nextFloat();
        System.out.printf("So tien Viet Nam: %.4f", usd*rate);
    }
}
