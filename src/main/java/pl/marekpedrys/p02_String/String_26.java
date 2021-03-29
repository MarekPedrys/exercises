//String_26.
//Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
//The word "is" should not be immediately preceeded or followed by a letter.

package pl.marekpedrys.p02_String;

public class String_26 {

    public static void main(String[] args) {
        System.out.println(notReplace("this is test"));
        System.out.println(notReplace("it is his kiss"));
        System.out.println(notReplace("her name is isabell"));
        System.out.println(notReplace("Is is is-is"));
        System.out.println(notReplace("abc"));
        System.out.println(notReplace(""));
    }

    public static String notReplace(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i).startsWith("is")
                    && (i - 1 < 0 || !Character.isLetter(str.charAt(i - 1)))
                    && (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
                String substringAfterReplace = str.substring(i).replaceFirst("is", "is not");
                str = str.substring(0, i) + substringAfterReplace;
            }
        }
        return str;
    }

}
