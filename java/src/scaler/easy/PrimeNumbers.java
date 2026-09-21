package scaler.easy;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Check Prime:  Enter Number ");
        System.out.println(primeNumbers.isPrime(sc.nextInt()));
        sc.close();

    }

    public boolean isPrime(int n) {

        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || (n % (i + 2) == 0))
                return false;
        }

        return true;
    }
}
