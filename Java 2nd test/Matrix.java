public class Matrix {
        public static void main(String[] args) {
            int[][] A = {{1, 2}, {3, 4}};
            int[][] B = {{5, 6}, {7, 8}};
            
            int m = A.length;
            int n = A[0].length;
    
            int[][] C = new int[m][n];
    
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
    
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    