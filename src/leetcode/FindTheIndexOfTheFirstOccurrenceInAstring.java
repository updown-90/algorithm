package leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAstring {
    public static void main(String[] args) {
        String haystack = "asadbutsad", needle = "sad";

        if (haystack.indexOf(needle) > -1) {
            System.out.println(haystack.indexOf(needle));
        } else{
            System.out.println(-1);
        }
    }
}
