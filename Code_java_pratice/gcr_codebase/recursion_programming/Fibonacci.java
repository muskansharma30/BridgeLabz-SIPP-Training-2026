<<<<<<< HEAD
=======
package gcr_codebase.recursion_programming;

>>>>>>> 3e3d7f1 (muskan)
public class Fibonacci {

    static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; i++)
            System.out.print(fib(i) + " ");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3e3d7f1 (muskan)
