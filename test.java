import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0) {
            printHello();
        } else
            printBye();
    }




    private static void printBye() {
        System.out.println("Bye Java");
    }

    private static void printHello() {
        System.out.println("Hello Java");
    }
}