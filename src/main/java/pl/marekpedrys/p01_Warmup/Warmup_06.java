// Warmup_06.
// Write a public static method with the name sumDigits with parameter of type int named number.
// Method needs to return the sum of all digits of the number. Use "%" and "/" operators.

package pl.marekpedrys.p01_Warmup;

public class Warmup_06 {

    public static void main(String[] args) {
        System.out.println(sumDigits(-811));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(1234567890));
    }

    public static int sumDigits(int number) {
        int absNumber = Math.abs(number);
        int sum = 0;

        while (absNumber > 0) {
            int lastDigit = absNumber % 10;
            sum += lastDigit;
            absNumber /= 10;
        }
        return sum;
    }
}
