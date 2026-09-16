public class matrix2dinsertionsort {

    public static void main(String[] args) {

        int[][] arr = {
            {64, 45, 11},
            {21, 10, 32}
        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr[i].length; j++) {

                int key = arr[i][j];
                int k = j - 1;

                while (k >= 0 && arr[i][k] > key) {
                    arr[i][k + 1] = arr[i][k];
                    k--;
                }

                arr[i][k + 1] = key;
            }
        }

        // Print matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

