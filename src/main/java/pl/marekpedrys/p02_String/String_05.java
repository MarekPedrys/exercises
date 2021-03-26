//String_05.
//Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
// and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

package pl.marekpedrys.p02_String;

public class String_05 {

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
        System.out.println(deFront("a"));
        System.out.println(deFront("b"));
        System.out.println(deFront("abcd"));
        System.out.println(deFront("zzz"));
    }

    public static String deFront(String str) {
        if (str.length() > 1) {
            boolean aIsFirst = str.charAt(0) == 'a';
            boolean bIsSecond = str.charAt(1) == 'b';

            if (aIsFirst && bIsSecond) {
                return str;
            }

            if (aIsFirst) {
                return "a" + str.substring(2);
            }

            if (bIsSecond) {
                return str.substring(1);
            }

            return str.substring(2);
        }

        return str.equals("a") ? "a" : "";
    }

}
