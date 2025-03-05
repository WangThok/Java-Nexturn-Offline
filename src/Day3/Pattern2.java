public class Pattern2{
    public static void main(String[] args) {
        
        int rows=3;
        int num=1;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  "); 
            }

            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    
    }
}