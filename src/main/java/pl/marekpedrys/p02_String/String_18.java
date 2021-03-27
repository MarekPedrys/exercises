//String_18.
//Given a string and a non-empty word string, return a string made of each char just before and just after
// every appearance of the word in the string. Ignore cases where there is no char before or after the word,
// and a char may be included twice if it is between two words.

package pl.marekpedrys.p02_String;

public class String_18 {

    public static void main(String[] args) {
        System.out.println(wordEnds("12ab34abC", "ab"));
        System.out.println(wordEnds("1x1", "1"));
        System.out.println(wordEnds("xy1xy", "xy"));
        System.out.println(wordEnds("xy123xy", "xy"));
    }

    public static String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            if (str.substring(i).startsWith(word)) {
                result.append(i - 1 >= 0 ? str.charAt(i - 1) : "");
                result.append(i + word.length() < strLength ? str.charAt(i + word.length()) : "");
            }
        }
        return result.toString();
    }

}
