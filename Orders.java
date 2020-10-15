import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (product){
            case"coffee":
                price = 1.5;
                printTotalPrice(price,quantity);
                break;
            case "water":
                price = 1;
                printTotalPrice(price,quantity);
                break;
            case "coke":
                price = 1.4;
                printTotalPrice(price,quantity);
                break;
            case "snacks":
                price = 2;
                printTotalPrice(price,quantity);
                break;

        }
    }

    private static void printTotalPrice(double price, int quantity) {
        System.out.printf("%.2f",quantity*price);
    }
}
