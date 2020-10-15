import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                int result = getMax(firstNumber,secondNumber);
                System.out.println(result);
                break;
            case "char":
                char firstChar =scanner.nextLine().charAt(0);
                char secondChar =scanner.nextLine().charAt(0);
                char resultChar = getMax(firstChar,secondChar);
                System.out.println(resultChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultString = getMax(firstString, secondString);
                System.out.println(resultString);
                break;

        }
    }

    private static String getMax(String firstString, String secondString) {
        {
            int comparison = firstString.compareTo(secondString);
            if (comparison > 0) {
                return firstString;
            } else {
                return secondString;
            }
        }
    }

    private static char getMax (char firstChar, char secondChar) {
        return (char) Math.max(firstChar,secondChar);
    }

    private static int getMax(int firstNumber, int secondNumber) {

        return Math.max(firstNumber,secondNumber);
    }


}
