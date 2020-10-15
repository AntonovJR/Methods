import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grades = Double.parseDouble(scanner.nextLine());
        checkInteger(grades);

    }

    private static void checkInteger(double grades) {
        if(grades<=2.99){
            System.out.print("Fail");
        }else if(grades>=3&&grades<=3.49) {
            System.out.print("Poor");
        }else if(grades>3.49&&grades<=4.49) {
            System.out.print("Good");
        }else if(grades>4.49&&grades<=5.49) {
            System.out.print("Very good");
        }else if(grades>5.49) {
            System.out.print("Excellent");
        }
        }
    }

