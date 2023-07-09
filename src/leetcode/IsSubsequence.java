package leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "b", t = "abcd";

        if (s.isEmpty()) {
            System.out.println(false);
        }

        int pointer1 = 0;
        int pointer2 = 0;
        for (char c : t.toCharArray()) {
            if (s.charAt(pointer1) == t.charAt(pointer2)) {
                pointer1++;
                pointer2++;
            } else {
                pointer2++;
            }

            if (pointer1 == s.length()) {
                break;
            }
        }

        System.out.println(pointer1 == s.length());
    }
}
