//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int result = addSum(8, 10);
        System.out.println("Sum: " + result);

        int resultMultiple = multiply(7, 8);
        System.out.println("Multiply: " + resultMultiple);
    }

    public static int addSum(int a, int b){
        return a + b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }
}