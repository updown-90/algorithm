package leetcode;

import java.math.BigInteger;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int count = 0;

        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;

            }
        }

        System.out.println(count);
    }
}
