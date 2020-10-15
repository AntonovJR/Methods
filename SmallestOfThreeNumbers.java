import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int smallest = getMinNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(smallest);

    }

    private static int getMinNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int smallNumber = getMin(firstNumber, secondNumber);
        return Math.min(smallNumber, thirdNumber);
    }

    private static int getMin(int firstNumber, int secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }
}
