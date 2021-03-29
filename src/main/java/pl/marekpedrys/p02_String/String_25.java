//String_25.
//Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
//A number is a series of 1 or more digit chars in a row.

package pl.marekpedrys.p02_String;

public class String_25 {

    public static void main(String[] args) {
        System.out.println(sumNumbers("1a2b3"));
        System.out.println(sumNumbers("a12b3"));
        System.out.println(sumNumbers("123a"));
        System.out.println(sumNumbers("10$%^12"));
        System.out.println(sumNumbers(""));
    }

    public static int sumNumbers(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int numberLength = 1;

                for (int j = 1; i + j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(i + j))) {
                        numberLength++;
                    } else {
                        break;
                    }
                }

                int number = Integer.parseInt(str.substring(i, i + numberLength));
                result += number;
                i += numberLength;
            }
        }

        return result;
    }
}
