import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double number = Double.parseDouble(scanner.nextLine());
       double pow = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(getResult(number,pow)));

    }

    private static double getResult(double number, double pow) {
        double result = 1;
        for (int i = 0; i <pow ; i++) {
            result *=number;

        }
        return result;
    }
}
