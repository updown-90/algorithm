package leetcode;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";

        String[] s1 = s.split(" ");
        System.out.println(s1.length);
        System.out.println(Arrays.toString(s1));
        System.out.println(s1[s1.length-1]);
    }
}
