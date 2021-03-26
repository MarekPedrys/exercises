//String_12.
//A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
// appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

package pl.marekpedrys.p02_String;

public class String_12 {

    public static void main(String[] args) {
        System.out.println(getSandwich("bread-butter-bread"));
        System.out.println(getSandwich("bread-bread-jam-bread"));
        System.out.println(getSandwich("xy"));
        System.out.println(getSandwich("breadbread"));
    }

    public static String getSandwich(String str) {
        if (str.contains("bread")) {
            int firstBreadIndex = str.indexOf("bread");
            int lastBreadIndex = str.lastIndexOf("bread");

            if (firstBreadIndex != lastBreadIndex) {
                return str.substring(firstBreadIndex + 5, lastBreadIndex);
            }
        }

        return "";
    }

}
