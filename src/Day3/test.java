public class test{
    public static void main(String[] args) {
        
        int rows=3;
        int num=1;

        for (int i = 1; i <= rows; i++) {
            for (int j =1 ; j <= rows-1; j++){
                System.out.print(" ");
                }
                for (int j = 1; j < (2*i)-1 ; j++){
                    System.out.print(num+"");
                    num++;
              
                }
                System.out.println("");
                

            
            
        }
    }
}