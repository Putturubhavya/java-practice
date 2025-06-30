public class ArrayOperations {
    public static void main(String[] args) {
        int[][] arr1 = { { 10, 20 }, { 30, 40 } };
        int[][] arr2 = { { 5, 6 }, { 1, 2 } };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        // int[][] arr3 = new int[2][2];
        // for (int i = 0; i < arr1.length; i++) {
        // for (int j = 0; j < arr2[0].length; j++) {
        // for (int k = 0; k < arr1[0].length; k++) {
        // arr3[i][j] += arr1[i][k] * arr2[k][j];
        // }
        // System.out.print(arr3[i][j] + " ");
        // }
        // System.out.println();
        // }
        int[][] arr4 = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (arr2[i][j] != 0)
                    arr4[i][j] = arr1[i][j] / arr2[i][j];
                else
                    arr4[i][j] = 0;
            }
            System.out.println();

        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

    }
}
