public class Fibonacci {

    public static void printFibonacci(int n) {
        if (n <= 0) return; 
        if (n == 1) {
            System.out.print("0 ");
            return;
        }

        int first = 0, second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        printFibonacci(n);
    }
}
