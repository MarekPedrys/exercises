//String_14.
//Given a string, compute a new string by moving the first char to come after the next two chars.
// Repeat this process for each subsequent group of 3 chars. Ignore any group of fewer than 3 chars at the end.

package pl.marekpedrys.p02_String;

public class String_14 {

    public static void main(String[] args) {
        System.out.println(oneTwo("AbcDef"));
        System.out.println(oneTwo("ab"));
        System.out.println(oneTwo("1234"));
        System.out.println(oneTwo(""));
    }

    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() - 2; i = i + 3) {
            char c = str.charAt(i);
            String substring = str.substring(i + 1, i + 3);
            result.append(substring);
            result.append(c);
        }

        return result.toString();
    }

}
