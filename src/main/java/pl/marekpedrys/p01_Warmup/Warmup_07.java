// Warmup_07.
// Write a public static method called isPalindrome with one parameter of type int named number.
// Method needs to return true if the number is a palindrome number otherwise it should return false.

package pl.marekpedrys.p01_Warmup;

public class Warmup_07 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(4));
        System.out.println(isPalindrome(51));
        System.out.println(isPalindrome(-954459));
        System.out.println(isPalindrome(123454321));
    }

    public static boolean isPalindrome(int number) {
        int absNumber = Math.abs(number);
        int reversedAbsNumber = 0;

        while (absNumber > 0) {
            int tempNumberLastDigit = absNumber % 10;
            absNumber /= 10;
            reversedAbsNumber *= 10;
            reversedAbsNumber += tempNumberLastDigit;
        }

        return reversedAbsNumber == Math.abs(number);
    }
}
