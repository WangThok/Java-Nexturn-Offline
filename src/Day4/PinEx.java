
import java.util.Scanner;

public class PinEx {

    public static void main(String[] args) {
        int attempt = 1;
        int pin = 1234;
        Scanner sc = new Scanner(System.in);

        while (attempt <= 3) {
            System.out.println("Enter the PIN: ");
            int trypin = sc.nextInt();

            if (trypin == pin) {
                System.out.println("Correct PIN. Access Granted!");
                break;
            } else {
                System.out.println("Incorrect PIN.");
                attempt++;
                
                }
                if (attempt > 3) {
                    System.out.println("Too many incorrect attempts. Your account is locked.");
            }
        }

        sc.close();
    }
}
