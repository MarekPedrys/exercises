//String_13.
//Returns true if for every '*' (star) in the string, if there are chars
//both immediately before and after the star, they are the same.

package pl.marekpedrys.p02_String;

public class String_13 {

    public static void main(String[] args) {
        System.out.println(sameStarChar("bread-*-"));
        System.out.println(sameStarChar(""));
        System.out.println(sameStarChar("xy"));
        System.out.println(sameStarChar("a*"));
        System.out.println(sameStarChar("a*b"));
    }

    public static boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

}
