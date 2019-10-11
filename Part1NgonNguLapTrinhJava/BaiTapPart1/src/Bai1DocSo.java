import java.util.Scanner;

public class Bai1DocSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Input number: ");
            number = input.nextInt();
        } while ((number < 0) || (number > 999));
        String result = checkNumber(number);
        System.out.println(result);
    }

    public static String checkNumber(int number) {
        String result = "";
        if (number < 10) {
            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
            }
        } else if (number < 100) {
            switch (number) {
                case 10:
                    result = "ten";
                    break;
                case 11:
                    result = "eleven";
                    break;
                case 12:
                    result = "twelve";
                    break;
                case 13:
                    result = "thirteen";
                    break;
                case 14:
                    result = "fourteen";
                    break;
                case 15:
                    result = "fifteen";
                    break;
                case 16:
                    result = "sixteen";
                    break;
                case 17:
                    result = "seventeen";
                    break;
                case 18:
                    result = "eighteen";
                    break;
                case 19:
                    result = "nineteen";
                    break;
                case 20:
                    result = "twenty";
                    break;
                case 30:
                    result = "thirty";
                    break;
                case 40:
                    result = "forty";
                    break;
                case 50:
                    result = "fifty";
                    break;
                case 60:
                    result = "sixty";
                    break;
                case 70:
                    result = "seventy";
                    break;
                case 80:
                    result = "eighty";
                    break;
                case 90:
                    result = "ninety";
                    break;
                default:
                    int[] arr = new int[2];
                    arr[0] = number % 10;
                    arr[1] = number - arr[0];
                    result = checkNumber(arr[1]) + " " + checkNumber(arr[0]);
            }
        } else {
            int[] arr = new int[2];
            arr[0] = number % 100;
            arr[1] = number / 100;
            result = checkNumber(arr[1]) + " hundred and " + checkNumber(arr[0]);
        }
        return result;
    }
}
