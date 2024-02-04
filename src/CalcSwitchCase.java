public class CalcSwitchCase {

    public static double calc(double paramA, double paramB, char operation) {
        double result = 0;

        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            default:
                System.out.println("INCORRECT OPERATION!");
                break;
        }

        System.out.println("Calc result: " + result);
        return result;
    }

    public static void main(String[] args) {
        double operand1 = 10.0;
        double operand2 = 5.0;
        char operation = '+';

        calc(operand1, operand2, operation);
    }
}