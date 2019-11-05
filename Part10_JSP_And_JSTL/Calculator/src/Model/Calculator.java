package Model;

public class Calculator {
    public static final byte plus = 1;
    public static final byte minus = 2;
    public static final byte multi = 3;
    public static final byte divine = 4;
    public static double calculator(float firstOperand, float secondOperand, byte operator) throws Exception{
        double result = 0;
        switch (operator){
            case Calculator.plus:
                result = (firstOperand + secondOperand);
                break;
            case Calculator.minus:
                result = (firstOperand - secondOperand);
                break;
            case Calculator.multi:
                result = (firstOperand * secondOperand);
                break;
            case Calculator.divine:
                result = firstOperand / secondOperand;
        }
        return result;
    }
}
