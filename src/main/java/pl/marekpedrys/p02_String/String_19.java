//String_19.
//We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
// Return true if all the g's in the given string are happy.

package pl.marekpedrys.p02_String;

public class String_19 {

    public static void main(String[] args) {
        System.out.println(gHappy("ggg"));
        System.out.println(gHappy("g"));
        System.out.println(gHappy("agg"));
        System.out.println(gHappy("ggag"));
        System.out.println(gHappy(""));
    }

    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g'
                    && (i - 1 < 0 || str.charAt(i - 1) != 'g')
                    && (i + 1 >= str.length() || str.charAt(i + 1) != 'g')) {
                return false;
            }
        }
        return true;
    }

}
