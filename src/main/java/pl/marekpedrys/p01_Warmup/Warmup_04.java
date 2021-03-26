// Warmup_04.
// Write a public static method getDaysInMonth with parameters of type int: month and year.
// Call a public static method isLeapYear with a parameter of type int named year (year needs to be >=1 and <=9999).


package pl.marekpedrys.p01_Warmup;

public class Warmup_04 {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 1996));
        System.out.println(getDaysInMonth(12, 2020));
        System.out.println(getDaysInMonth(2, 1900));
        System.out.println(getDaysInMonth(13, 2007));
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

}
