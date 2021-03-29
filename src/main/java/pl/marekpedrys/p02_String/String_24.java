//String_24.
//Given a string, return the length of the largest "block" in the string.
//A block is a run of adjacent chars that are the same.

package pl.marekpedrys.p02_String;

public class String_24 {

    public static void main(String[] args) {
        System.out.println(maxBlock("aaabb"));
        System.out.println(maxBlock("ababab"));
        System.out.println(maxBlock("1111221"));
        System.out.println(maxBlock("b"));
        System.out.println(maxBlock("abc"));
        System.out.println(maxBlock(""));
    }

    public static int maxBlock(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            int resultI = 1;

            for (int j = 1; i + j < str.length(); j++) {
                if (str.charAt(i + j) == str.charAt(i)) {
                    resultI++;
                    result = Math.max(resultI, result);
                } else {
                    result = Math.max(resultI, result);
                    break;
                }
            }
        }
        return result;
    }
}
