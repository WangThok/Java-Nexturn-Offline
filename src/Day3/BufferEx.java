
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an integer: ");
        int number = Integer.parseInt(reader.readLine());  teger

        System.out.print("Enter a word: ");
        String word = reader.readLine();

        System.out.println("You entered: " + number + " and " + word);
    }
}
