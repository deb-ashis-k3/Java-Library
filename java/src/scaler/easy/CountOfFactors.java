package scaler.easy;

public class CountOfFactors {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    static int solve(int n) {
        // A non-positive number does not have a finite set of positive factors.
        if (n <= 0)
            return 0;

        int counter = 0;

        /*
         * Factors come in pairs:
         * if i divides n, then n / i is also a factor.
         *
         * We only need to check i up to sqrt(n). Checking i <= n / i
         * is equivalent to i * i <= n, but avoids integer overflow.
         */
        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                // Print the matching factor pair for this divisor.
                System.out.println("N / i : " + n + "/" + i + " = " + n / i);

                // A perfect square has one repeated factor at sqrt(n),
                // so count it only once; otherwise count both factors.
                if (i == n / i) {
                    counter++;
                } else {
                    counter += 2;
                }
            }
        }

        // Every factor pair has now been counted.
        return counter;
    }
}
