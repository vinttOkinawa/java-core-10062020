package lession4;

public class Activity46 {

    public static String getSandwich(String str) {
        String result = "";
        String bread = "bread";
        int len = str.length();
        if (len > 10) {
            int first = str.indexOf(bread);
            int last = str.lastIndexOf(bread);
            result = str.substring(first + 5, last);
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        getSandwich("breadjambread");
        getSandwich("xxbreadjambreadyy");
        getSandwich("xxbreadyy");
    }
}
