import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        charFlow(firstChar, secondChar);


    }

    public static void charFlow(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (char i = (char) (firstChar + 1); i < secondChar; i++) {
                System.out.print(i + " ");
            }

        } else {
            for (char i = (char) (secondChar + 1); i < firstChar; i++) {
                System.out.print(i + " ");
            }


        }

    }
}
