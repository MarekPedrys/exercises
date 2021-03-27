//String_16.
//Return a version of the given string, where for every star (*) in the string:
//the star and the chars immediately to its left and right are gone.

package pl.marekpedrys.p02_String;

import java.util.ArrayList;

public class String_16 {

    public static void main(String[] args) {
        System.out.println(starOut(""));
        System.out.println(starOut("ab*"));
        System.out.println(starOut("*cd"));
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("a*b**cd*ef"));
    }

    public static String starOut(String str) {
        ArrayList<Integer> starsIndexes = new ArrayList<Integer>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                starsIndexes.add(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (!starsIndexes.contains(i) && !starsIndexes.contains(i - 1) && !starsIndexes.contains(i + 1)) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

}
