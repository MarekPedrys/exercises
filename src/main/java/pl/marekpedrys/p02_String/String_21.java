//String_21.
//Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
//Return 0 if there are no digits in the string.

package pl.marekpedrys.p02_String;

public class String_21 {

    public static void main(String[] args) {
        System.out.println(sumDigits("gg12ga"));
        System.out.println(sumDigits("a2aa4ab6"));
        System.out.println(sumDigits("abbb"));
        System.out.println(sumDigits(""));
    }

    public static int sumDigits(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += Integer.parseInt(str.charAt(i) + "");
            }
        }
        return result;
    }


}
