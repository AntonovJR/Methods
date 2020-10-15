import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        long factorialFirst = findFactorial(first);
        long factorialSecond = findFactorialSecond(second);
       double total = factorialFirst/factorialSecond*1.0;
        System.out.printf("%.2f",total);
    }

    private static long findFactorialSecond(int second) {
        long result = second;
        for (int i = second-1; i >=1 ; i--) {
            result*=i;
        }
        return result;
    }

    private static long findFactorial(int first) {
        long result = first;
        for (int i = first-1; i >=1 ; i--) {
            result*=i;
        }
        return result;
    }
}
