import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        checkInteger(input);

    }

    private static void checkInteger(int input) {
        if(input<0){
            System.out.printf("The number %d is negative.",input);
        }else if(input>0) {
            System.out.printf("The number %d is positive.", input);
        }else{
            System.out.println("The number 0 is zero.");
        }
    }
}
