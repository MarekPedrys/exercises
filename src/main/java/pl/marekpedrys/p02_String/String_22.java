//String_22.
//Given a string, return the longest substring that appears at both the beginning
//and end of the string without overlapping.

package pl.marekpedrys.p02_String;

public class String_22 {

    public static void main(String[] args) {
        System.out.println(sameEnds("ggga"));
        System.out.println(sameEnds("aaaab"));
        System.out.println(sameEnds("abbb"));
        System.out.println(sameEnds("bbaab"));
        System.out.println(sameEnds(""));
    }

    public static String sameEnds(String string) {
        int resultLength = 0;

        for (int i = 1; i <= string.length() / 2; i++) {
            String beginning = string.substring(0, i);
            String end = string.substring(string.length() - i);

            if (beginning.equals(end)) {
                resultLength = i;
            }
        }

        return string.substring(0, resultLength);
    }


}
