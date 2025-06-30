import java.util.Scanner;

public class rotationOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr1 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of the matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}