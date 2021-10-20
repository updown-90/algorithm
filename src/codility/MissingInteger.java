package codility;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {-1, -3};
        Arrays.sort(A);

        int returnValue = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (Math.abs(A[i] - A[i + 1]) != 1) {
                returnValue = A[i + 1] - 1;
            }
        }

        if (returnValue == 0) {
            returnValue = A[A.length - 1] + 1;
        } else if (returnValue < 0) {
            returnValue = 1;
        }

        System.out.println(returnValue);


    }
}
