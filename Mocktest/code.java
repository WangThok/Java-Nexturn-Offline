import java.util.Scanner;
public class code{
    static int sumofdigits(int n){
        if (n==0){
            return 0;
        }
        else return (n%10 )+sumofdigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        int num=sc.nextInt();
        int sum=sumofdigits(num);
        System.out.println("The sum is "+ sum);
        


    }
}