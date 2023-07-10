package leetcode;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";

        BigInteger bigIntegerA = new BigInteger(a, 2);
        BigInteger bigIntegerB = new BigInteger(b, 2);
        System.out.println(bigIntegerA.add(bigIntegerB).toString(2));
    }
}
