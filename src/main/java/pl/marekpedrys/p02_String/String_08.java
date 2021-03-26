//String_08.
//Given two strings, return true if either of the strings appears at the very end of the other string,
// ignoring upper/lower case differences

package pl.marekpedrys.p02_String;

public class String_08 {

    public static void main(String[] args) {
        System.out.println(endOther("cd","ABCd"));
        System.out.println(endOther("ABCD","ab"));
        System.out.println(endOther("","ABCd"));
    }

    public static boolean endOther(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        String aLowerCase = a.toLowerCase();
        String bLowerCase = b.toLowerCase();

        if (lengthA < lengthB) {
            return bLowerCase.substring(lengthB - lengthA).equals(aLowerCase);
        }

        if (lengthB < lengthA) {
            return aLowerCase.substring(lengthA - lengthB).equals(bLowerCase);
        }

        return aLowerCase.equals(bLowerCase);
    }

}
