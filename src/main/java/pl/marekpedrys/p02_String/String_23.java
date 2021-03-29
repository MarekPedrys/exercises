//String_23.
//Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
//In other words, zero or more characters at the very begining of the given string, and at the very end of the string
// in reverse order (possibly overlapping).

package pl.marekpedrys.p02_String;

public class String_23 {

    public static void main(String[] args) {
        System.out.println(mirrorEnds("ggga"));
        System.out.println(mirrorEnds("aaaab"));
        System.out.println(mirrorEnds("abbb"));
        System.out.println(mirrorEnds("bbaab"));
        System.out.println(mirrorEnds(""));
    }

    public static String mirrorEnds(String string) {
        StringBuilder sb = new StringBuilder(string);
        String reversedString = sb.reverse().toString();
        int resultLength = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == reversedString.charAt(i)) {
                resultLength++;
            } else {
                break;
            }
        }

        return string.substring(0, resultLength);
    }


}
