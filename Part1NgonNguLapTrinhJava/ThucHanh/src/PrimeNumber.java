public class PrimeNumber {
    public static void main(String[] noInput){
        System.out.println("Prime number <100:");
        for (int i = 0;i<100;i++){
            if (checkPrimeNumber(i)){
                System.out.print(i + ", ");
            }
        }
    }
    public static boolean checkPrimeNumber(int number){
        if (number<2)
            return false;
        if (number>2){
            int limit = (int)Math.sqrt(number);
            for (int i=2; i<=limit;i++){
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}
