import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=input ; i++) {
            printNumbersIncreasing(i);
        }
      for (int i = input-1; i >=1 ; i--) {
            printNumbersDecreasing(i);
        }

    }

    private static void printNumbersDecreasing(int i) {
        for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }


    private static void printNumbersIncreasing(int i) {
        for (int j = 1; j <=i ; j++) {
            System.out.print(j+" ");
        }
        System.out.println();

    }
}
