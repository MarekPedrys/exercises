// Warmup_02.
// Write a public method that has 1 parameter of type int named year. Method needs to calculate
// if the year is a leap year. If the year is not greater than 0, return false.

package pl.marekpedrys.p01_Warmup;

public class Warmup_02 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(-1));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1) {
            return false;
        }
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
//    2nd version:
//    public static boolean isLeapYear(int year) {
//        if (year < 1) {
//            return false;
//        }
//        if (year % 4 != 0) {
//            return false;
//        }
//        if (year % 100 != 0) {
//            return true;
//        }
//        return year % 400 == 0;
//    }
}
