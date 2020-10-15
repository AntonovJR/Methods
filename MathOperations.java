import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

double a = Double.parseDouble(scanner.nextLine());
String operation = scanner.nextLine();
      double b = Double.parseDouble(scanner.nextLine());

        switch (operation){
            case "+":
                add(a,b);
                break;
            case "*":
                multiply(a,b);
                break;
            case "-":
                subtract(a,b);
                break;
            case "/":
                divide(a,b);
                break;


        }


    }

    private static void divide(double a, double b) {
        System.out.println(new DecimalFormat("0.##").format(a/b));
    }

    private static void subtract(double a, double b) {
        System.out.println(new DecimalFormat("0.##").format(a-b));
    }

    private static void multiply(double a, double b) {
        System.out.println(new DecimalFormat("0.##").format(a*b));
    }

    private static void add(double a, double b) {
        System.out.println(new DecimalFormat("0.##").format(a+b));
    }
}
