//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int result = addSum(8, 10);
        System.out.println("Sum: " + result);

        int multipleResult = multiple(7, 8);
        System.out.println("Multiple: " + multipleResult);
    }

    public static int addSum(int a, int b){
        return a + b;
    }

    public static int multiple(int a, int b){
        return a * b;
    }
}