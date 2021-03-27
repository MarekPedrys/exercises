//String_17.
//Given a string and a non-empty word string, return a version of the original String where all chars
// have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.

package pl.marekpedrys.p02_String;

import java.util.ArrayList;

public class String_17 {

    public static void main(String[] args) {
        System.out.println(plusOut("1231234","1"));
        System.out.println(plusOut("abcd","ef"));
        System.out.println(plusOut("abcDEabcFGabc","abc"));
    }

    public static String plusOut(String str, String word) {
        ArrayList<Integer> wordsIndexes = new ArrayList<Integer>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(word)) {
                for (int j = 0; j < word.length(); j++) {
                    wordsIndexes.add(i + j);
                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (wordsIndexes.contains(i)) {
                result.append(str.charAt(i));
            } else {
                result.append("+");
            }
        }

        return result.toString();
    }

}
