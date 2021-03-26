//String_10.
//Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
// the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

package pl.marekpedrys.p02_String;

public class String_10 {

    public static void main(String[] args) {
        System.out.println(mixString("ABCD", "abcdef"));
        System.out.println(mixString("123", "ab"));
        System.out.println(mixString("3", "cxyz"));

    }

    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lengthA = a.length();
        int lengthB = b.length();
        int maxLength = Math.max(lengthA, lengthB);

        for (int i = 0; i < maxLength; i++) {
            if (i < lengthA) {
                result.append(a.charAt(i));
            }
            if (i < lengthB) {
                result.append(b.charAt(i));
            }
        }
        return result.toString();
    }

}
