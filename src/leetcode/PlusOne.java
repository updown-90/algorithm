package leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};

        String numString = "";
        for (int i : num) {
            numString += i;
        }

        String x = String.valueOf(new BigInteger(numString).add(new BigInteger("1")));
        int[] returnValue = new int[x.length()];

        for (int i = 0; i < returnValue.length; i++) {
            returnValue[i] = Character.getNumericValue(x.charAt(i));
        }

        System.out.println(Arrays.toString(returnValue));

    }
}
