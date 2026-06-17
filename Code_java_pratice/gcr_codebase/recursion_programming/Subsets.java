package gcr_codebase.recursion_programming;

public class Subsets {

    static void generate(int[] arr, int index, String subset) {
        if (index == arr.length) {
            System.out.println("[" + subset + "]");
            return;
        }

        generate(arr, index + 1, subset);

        if (subset.isEmpty())
            generate(arr, index + 1, subset + arr[index]);
        else
            generate(arr, index + 1, subset + "," + arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        generate(arr, 0, "");
    }
}
