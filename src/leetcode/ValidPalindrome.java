package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";

        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuffer sb = new StringBuffer(s1);
        String reversedStr = sb.reverse().toString();

        System.out.println(s1.equals(reversedStr));
    }
}
