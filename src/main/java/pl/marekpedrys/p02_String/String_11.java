//String_11.
//Given a string, does "xyz" appear in the middle of the string? To define middle,
//we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
//This problem is harder than it looks.

package pl.marekpedrys.p02_String;

public class String_11 {

    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyzt"));
        System.out.println(xyzMiddle("aaxyzaa"));
        System.out.println(xyzMiddle("xy"));
        System.out.println(xyzMiddle("abxyz"));
    }

    public static boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }

        int length = str.length();

        if (length % 2 == 1) {
            return str.substring((length - 3) / 2).startsWith("xyz");
        }

        return (str.substring((length - 3) / 2).startsWith("xyz")
                || str.substring((length - 3) / 2 + 1).startsWith("xyz"));
    }

}
