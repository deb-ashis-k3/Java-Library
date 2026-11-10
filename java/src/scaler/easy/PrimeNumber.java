package scaler.easy;

public class PrimeNumber {
    // Check the sample number and print whether it is prime.
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isPrime(n));

    }

    // Return true when n has no positive divisors other than 1 and itself.
    static boolean isPrime(int n) {

        // A prime number must be greater than 1.
        // 0, 1, and negative numbers are not prime.
        if (n <= 1) {
            return false;
        }

        // 2 and 3 are prime numbers.
        // Handle them separately because they are exceptions
        // to the divisibility checks below.
        if (n <= 3) {
            return true;
        }

        // Eliminate all even numbers and multiples of 3.
        // Any number divisible by 2 or 3 (except 2 and 3 themselves)
        // cannot be prime.
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        /*
         * 6k ± 1 OPTIMIZATION:
         *
         * Every integer can be represented in one of these forms:
         * 6k, 6k+1, 6k+2, 6k+3, 6k+4, 6k+5
         *
         * Eliminate:
         * 6k -> divisible by 6
         * 6k+2 -> divisible by 2
         * 6k+3 -> divisible by 3
         * 6k+4 -> divisible by 2
         *
         * Only two possible candidates remain:
         * 6k+5 = 6(k+1)-1 -> 6k-1 form
         * 6k+1 -> 6k+1 form
         *
         * Therefore, after checking divisibility by 2 and 3,
         * we only need to check divisors of the form 6k-1 and 6k+1.
         *
         * Example:
         * i = 5 -> check 5 and 7
         * i = 11 -> check 11 and 13
         * i = 17 -> check 17 and 19
         *
         * i += 6 moves to the next 6k-1 candidate.
         * i + 2 checks the corresponding 6k+1 candidate.
         *
         * We check only up to sqrt(n), because if n has a divisor
         * greater than sqrt(n), its paired divisor must be smaller
         * than sqrt(n).
         *
         * i <= n / i is used instead of i * i <= n
         * to avoid integer overflow.
         */
        for (int i = 5; i <= n / i; i += 6) {

            // Check both possible divisor candidates:
            // i -> 6k-1
            // i + 2 -> 6k+1
            //
            // If either divides n completely, n is not prime.
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        // No divisor found up to sqrt(n).
        // Therefore, n is prime.
        return true;
    }

}
