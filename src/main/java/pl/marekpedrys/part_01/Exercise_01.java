// 01.
// Write a public method that has 1 parameter of type int with the name minutes. Method needs to calculate
// the hours and remaining minutes from the parameter. Then it needs to print a message.

package pl.marekpedrys.part_01;

public class Exercise_01 {

    public static void main(String[] args) {
        printHoursAndMinutes(75);
        printHoursAndMinutes(-10);
    }

    public static void printHoursAndMinutes(int minutes) {
        if (minutes < 0) {
            System.out.println("Invalid argument: " + minutes + " min");
            return;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " min = " + hours + " h and " + remainingMinutes + " min");
    }

}
