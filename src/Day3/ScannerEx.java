import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Taking double input
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();

        // Consuming the leftover newline character
        sc.nextLine();

        // Taking string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Displaying the inputs
        System.out.println("Integer: " + num);
        System.out.println("Decimal: " + decimal);
        System.out.println("Name: " + name);

        sc.close();
    }
}
