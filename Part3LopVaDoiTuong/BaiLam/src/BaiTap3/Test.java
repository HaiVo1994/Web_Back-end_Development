package BaiTap3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        SwitchButton button = new SwitchButton(false);
        Scanner enter = new Scanner(System.in);
        int action = 0;
        do {
            System.out.println("Touch button: ");
            System.out.println("1. Turn off the lamp");
            System.out.println("2. Turn on the lamp");
            System.out.println("0. Exit");
            action = enter.nextInt();
            switch (action){
                case 1:
                    button.switchOff();
                    break;
                case 2:
                    button.switchOn();
                    break;
            }
            System.out.println(button.toString());
        }while (action!=0);
    }
}
