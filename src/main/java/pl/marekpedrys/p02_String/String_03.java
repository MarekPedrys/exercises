//String_03.
//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b.
//If either string is length 0, use '@' for its missing char.

package pl.marekpedrys.p02_String;

public class String_03 {

    public static void main(String[] args) {
        System.out.println(firstLastChars("", "abc"));
        System.out.println(firstLastChars("ABC", "def"));
        System.out.println(firstLastChars("5", ""));
    }

    public static String firstLastChars(String a, String b) {
        char first = a.length() > 0 ? a.charAt(0) : '@';
        char last = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
        return "" + first + last;
    }

}
