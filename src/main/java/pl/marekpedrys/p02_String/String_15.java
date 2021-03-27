//String_15.
//Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
// Return a string where for all such words, the middle letter is gone

package pl.marekpedrys.p02_String;

public class String_15 {

    public static void main(String[] args) {
        System.out.println(zipZap("zipzap"));
        System.out.println(zipZap("zi"));
        System.out.println(zipZap("1234"));
        System.out.println(zipZap("azpp"));
        System.out.println(zipZap(""));
    }

    public static String zipZap(String str) {

        if (str.matches(".*z.p.*")) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).matches("z.p")) {
                    String substring1 = str.substring(0, i + 1);
                    String substring2 = str.substring(i + 2);
                    str = substring1 + substring2;
                    i++;
                }
            }
        }
        return str;
    }

}
