//String_02.
//Given a string, return true if "bad" appears starting at index 0 or 1 in the string.

package pl.marekpedrys.p02_String;

public class String_02 {

    public static void main(String[] args) {
        System.out.println(hasBad("bada"));
        System.out.println(hasBad("12"));
        System.out.println(hasBad("Abad"));
        System.out.println(hasBad("aaBadBadBad"));
    }

    public static boolean hasBad(String str) {
        return str.startsWith("bad") || str.substring(1).startsWith("bad");
    }

}
