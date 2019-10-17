package BaiTap2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Human adam = new Human("Adam", true, 80);
        Human eva = new Human("Eva", false, 60);
        Apple apple = new Apple();
        int select = 0;
        Scanner enter = new Scanner(System.in);
        System.out.println(apple.toString());
        System.out.println(adam.toString());
        System.out.println(eva.toString());
        String messenger = "I ate apple";
        do{
            System.out.println("Select human: ");
            System.out.println("1. Adam");
            System.out.println("2. Eva");
            System.out.println("0. Exit");
            select = enter.nextInt();
            switch (select){
                case 0:
                    break;
                case 1:
                    adam.eat(apple);
                    System.out.println(adam.say(messenger));
                    System.out.println(adam.toString());
                    break;
                case 2:
                    eva.eat(apple);
                    System.out.println(eva.say(messenger));
                    System.out.println(eva.toString());
            }
            System.out.println(apple.toString());
        }while ((select!=0) && (!apple.isEmpty()));
    }
}
