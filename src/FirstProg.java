public class FirstProg {
    int numberA = 1;
    String CITY_OF_THE_BIRTH = "Dnipro";
    static void sayHello(){
        System.out.println("Hello World");
    }
    public static double checkSum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        calc(5, 2, '+');
        calc(5, 2, '-');
        calc(5, 2, '/');
        calc(5, 2, '*');
        calc(5, 2, '?');
    }

    static double calc(double paramA, double paramB, char operation) {
        double result = 0;

        if (operation == '+'){
            result = paramA + paramB;
        } else if(operation == '-') {
            result = paramA - paramB;
        } else if(operation == '/') {
            result = paramA / paramB;
        } else if(operation == '*') {
            result = paramA * paramB;
        } else {

            System.out.println("INCORRECT OPERATION!");

        }

        System.out.println("Calc result: " + result);
        return result;
    }
}
