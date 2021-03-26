// Warmup_03.
// Write a public method calcFeetAndInchesToCentimeters that has 2 parameter of type double: feet and inches.
// Validate that feet is >=0 and inches is >=0 and <12. Method needs to calculate how many centimetres comprise
// the feet and inches passed to this method and return that value.
// Write a second method of the same name but with only one parameter: inches.
// The 2nd method needs to call the 1st method.

package pl.marekpedrys.p01_Warmup;

public class Warmup_03 {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(6, 11));
        System.out.println(calcFeetAndInchesToCentimeters(-5, 3));
        System.out.println(calcFeetAndInchesToCentimeters(33));
        System.out.println(calcFeetAndInchesToCentimeters(-1.5));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches >= 12) {
            return -1;
        }
        return feet * 12 * 2.54 + inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return calcFeetAndInchesToCentimeters(inches / 12, 0);
    }
}
