import java.io.Console;

public class ConsoleEx {
    public static void main(String[] args) {
        
        Console console= System.console();
        if (console == null){
            System.out.println("no buffer ");
            return;
        }

        String username=console.readLine("enter username : ");
        char[] passwordCh=console.readPassword("enter password : ");
        String password = new String(passwordCh);

        System.out.println("username is " + username );
        System.out.println("Password is "+password);




    }
}
