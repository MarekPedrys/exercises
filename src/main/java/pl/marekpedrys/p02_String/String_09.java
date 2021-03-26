//String_09.
//Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

package pl.marekpedrys.p02_String;

public class String_09 {

    public static void main(String[] args) {
        System.out.println(bobThere("Bob"));
        System.out.println(bobThere("abob"));
        System.out.println(bobThere("AAAbob"));

    }

    public static boolean bobThere(String str) {
        int length = str.length();

        if (length > 2) {
            for (int i = 0; i < length - 2; i++) {
                if (str.substring(i, i + 3).matches("b.b")) {
                    return true;
                }
            }
        }
        return false;
    }

}
