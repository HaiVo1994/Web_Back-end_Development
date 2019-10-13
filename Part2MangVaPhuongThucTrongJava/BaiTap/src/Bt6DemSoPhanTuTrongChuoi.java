public class Bt6DemSoPhanTuTrongChuoi {
    public static short countChar(String text, char character){
        short count = 0;
        for (short i=0; i<text.length(); i++){
            if (text.charAt(i)==character)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "ewfrwefwefwefwef";
        System.out.print(countChar(text,'e'));
    }
}
