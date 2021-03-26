//String_04.
//Given a string of any length, return a new string where the last 2 chars, if present, are swapped.

package pl.marekpedrys.p02_String;

public class String_04 {

    public static void main(String[] args) {
        System.out.println(swapLastTwo("abc"));
        System.out.println(swapLastTwo(""));
        System.out.println(swapLastTwo("5"));
    }

    public static String swapLastTwo(String str) {
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 2)
                    + str.charAt(length - 1)
                    + str.charAt(length - 2);
        }
        return str;
    }

}
