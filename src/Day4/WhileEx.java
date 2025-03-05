import java.util.Scanner;
public class WhileEx{
    public static void main(String[] args) {
        int i=1;
        System.out.println("Please input the number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

System.out.println("The numbers are : ");
        while(i<=num){
            System.out.println(i);
            i++;
            
            
        }
    }
}