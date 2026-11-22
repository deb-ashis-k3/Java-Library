package scaler.easy;

public class CountOfFactors {

    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    static int solve(int n) {
        if (n <= 0)
            return 0;
        int counter = 0;
        for (int i = 1; i <= n / i; i++) {
            if (n % i == 0) {
                System.out.println("N / i : " + n + "/" + i + " = " + n / i);
                if (i == n / i) {
                    counter++;
                } else {
                    counter += 2;
                }
            }
        }
        return counter;
    }
}
