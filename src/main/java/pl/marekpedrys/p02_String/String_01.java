//String_01.
//Given a string of even length,return a string made of the middle two chars.
//The string length will be at least 2.

package pl.marekpedrys.p02_String;

public class String_01 {

    public static void main(String[] args) {
        System.out.println(middleTwo("xyzt"));
        System.out.println(middleTwo("12"));
        System.out.println(middleTwo("AaBbCcDd"));
    }

    public static String middleTwo(String str) {
        int strHalfLength = str.length() / 2;
        return str.substring(strHalfLength - 1, strHalfLength + 1);
    }

}
