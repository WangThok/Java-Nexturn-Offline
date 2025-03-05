import java.util.Arrays;
public class ArrayEx{
    public static void main(String[] args){
        int[] num={1,2,3,4,5};
        for ( int i=0;i<num.length;i++) {
            System.out.println(num[i]);
        }
        System.out.println(Arrays.sort(num) ); 

        
    }
}