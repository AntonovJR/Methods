import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printCube(n);

    }

    private static void printCube(int n) {
        for (int j = 0; j <n ; j++) {

            for (int i = 0; i <n ; i++) {
                System.out.print(n+" ");

            }
            System.out.println();
        }
    }
}
