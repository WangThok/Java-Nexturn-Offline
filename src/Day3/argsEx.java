
public class argsEx {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Enter name and age");
            return;
        }

        String name = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("Hello " + name + " I am " + age + " years old.");
     
    
    }
}
