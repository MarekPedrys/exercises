//String_06.
//Return the number of times that the string "Ab" appears anywhere in the given string.

package pl.marekpedrys.p02_String;

public class String_06 {

    public static void main(String[] args) {
        System.out.println(countAb("AbAbAb"));
        System.out.println(countAb("abAb"));
        System.out.println(countAb("ABCD"));
    }

    public static int countAb(String str) {
        int length = str.length();
        if (length < 2) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            if (str.substring(i, i + 2).equals("Ab")) {
                result++;
            }
        }
        return result;
    }

}
