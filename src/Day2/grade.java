
import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the grade");
        int marks=sc.nextInt();

        switch (marks/10){
            case 9 : System.out.println("A");
            break;

         
                case 8 : System.out.println("B");
                break;

             
                    case 7 : System.out.println("C");
                    break;

                        case 6 : System.out.println("D");
                        break;

                        default :  System.out.println("Fail");
                    }
                    sc.close();
        }
    }
