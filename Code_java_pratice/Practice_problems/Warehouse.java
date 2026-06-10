//A warehouse stores item quantities in an array. Find the max, min,
//total stock, and detect duplicates. Extend: rotate the stock array by
//k positions (simulate daily shift handover), and transpose a 2D shelf
//grid.
package Practice_problems;
import java.util.*;
public class Warehouse {
    // Function to rotate array by k positions
    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to transpose matrix
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {

        // Stock array
        int[] stock = {50, 30, 20, 50, 10, 30, 40};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int item : stock) {
            if (item > max) max = item;
            if (item < min) min = item;
            total += item;

            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);
        System.out.println("Duplicate Quantities: " + duplicates);

        // Rotate stock array
        int k = 3;
        rotateArray(stock, k);

        System.out.print("Stock Array after Rotation: ");
        for (int x : stock) {
            System.out.print(x + " ");
        }
        System.out.println();

        // 2D Shelf Grid
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposed = transpose(shelf);

        System.out.println("Transposed Shelf Grid:");
        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

