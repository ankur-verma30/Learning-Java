public class OperationsOn2DArrays {
    public static void main(String[] args) {
        int[][] A = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
        System.out.println("the Matrix A is ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] B = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };
        System.out.println("the Matrix B is ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        // Adition of two matrices\
        int[][] C = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("The Addition of A and B martrix result to C ");
        for (int[] x : C) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

        if (A[0].length == B.length) {
            System.out.println("The matrix multiplication is possible ");
            int AB[][] = new int[A.length][B[0].length];

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[j].length; k++) {
                        AB[i][j] += A[i][k] + B[k][j];
                    }
                }
            }
            for (int i = 0; i < AB.length; i++) {
                for (int j = 0; j < AB[i].length; j++) {
                    System.out.print(AB[i][j] + " ");
                }
                System.out.println("");
            }

        }

        System.out.println("Sorting the matrix...");

        // for sorting the array of strinngs

        String str[] = { "java", "python", "pascal", "smalltalk", "ada", "basic" };
        java.util.Arrays.sort(str);
        System.out.println("the value after the sorting of the string is ");

        for (int i = 0; i < str.length; i++)
            System.out.print(str[i] + "   ");f
    }

}
