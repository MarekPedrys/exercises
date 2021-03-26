//String_07.
//Return true if the string "cat" and "dog" appear the same number of times in the given string.

package pl.marekpedrys.p02_String;

public class String_07 {

    public static void main(String[] args) {
        System.out.println(catDog("catdogcatdog"));
        System.out.println(catDog("Catdog"));
        System.out.println(catDog("ABCD"));
        System.out.println(catDog(""));
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        int length = str.length();

        if (length > 2) {
            for (int i = 0; i < length - 2; i++) {
                String substring = str.substring(i, i+3);
                if (substring.equals("cat")) {
                    catCount++;
                }
                if (substring.equals("dog")) {
                    dogCount++;
                }
            }
            return catCount == dogCount;
        }
        return true;
    }

}
