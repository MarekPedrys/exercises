// Warmup_08.
// Write a public static method printPrimeNumbers with parameter of type int named limit.
// Method needs to print out all the prime numbers less or equal to the limit.

package pl.marekpedrys.p01_Warmup;

public class Warmup_08 {

    public static void main(String[] args) {
        printPrimeNumbers(101);
        printPrimeNumbers(-18);
    }

    public static void printPrimeNumbers(int limit) {
        if (limit < 2) {
            System.out.println("\nNo prime numbers to print");
        }
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
