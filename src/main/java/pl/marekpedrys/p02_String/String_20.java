//String_20.
//We'll say that a "triple" in a string is a char appearing three times in a row.
//Return the number of triples in the given string. The triples may overlap.

package pl.marekpedrys.p02_String;

public class String_20 {

    public static void main(String[] args) {
        System.out.println(countTriple("ggga"));
        System.out.println(countTriple("aaaab"));
        System.out.println(countTriple("abbb"));
        System.out.println(countTriple("bbaab"));
        System.out.println(countTriple(""));
    }

    public static  int countTriple(String str) {
        int result = 0;

        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                String triple = "" + str.charAt(i) + str.charAt(i) + str.charAt(i); // StringBuilder?
                if (str.substring(i).startsWith(triple)) {
                    result++;
                }
            }
        }
        return result;
    }

}
