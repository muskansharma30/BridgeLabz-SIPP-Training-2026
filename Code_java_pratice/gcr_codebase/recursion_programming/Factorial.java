<<<<<<< HEAD
=======
package gcr_codebase.recursion_programming;

>>>>>>> 3e3d7f1 (muskan)
public class Factorial {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 3e3d7f1 (muskan)
