import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        System.out.println(getVowels(input));
    }

    private static int getVowels(String input) {
        int counter = 0;
        for (int i = 0; i <input.length() ; i++) {
            char firstChar =input.charAt(i);
            if(firstChar=='a'||firstChar=='e'||firstChar=='o'||firstChar=='u'||firstChar=='i'||firstChar=='y')
                counter++;

        }

        return counter;
    }
}
