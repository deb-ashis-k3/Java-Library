package scaler.easy;

import java.util.Scanner;

public class CountOfFactors {
    public static void main(String[] args) {
        CountOfFactors cof = new CountOfFactors();
        System.out.print("Enter Number... ");
        Scanner sc = new Scanner(System.in);
        int result = cof.solve(sc.nextInt());
        System.out.println("Result: " + result);
        sc.close();

    }

    public int solve(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count += i == n / i ? 1 : 2;
            }
        }
        return count;
    }

}
