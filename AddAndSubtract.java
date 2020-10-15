import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int total = getTotal(first, second);
        int result = getSubtract(total, third);
        System.out.println(result);
    }

    private static int getSubtract(int total, int third) {
        return total-third;

    }

    private static int getTotal(int first, int second) {
        return first+second;
    }
}
