package codility;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {4, 1, 3};
        Arrays.sort(A);

        int returnValue = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (Math.abs(A[i] - A[i + 1]) == 1) {
                returnValue = 1;
            } else {
                returnValue = 0;
                break;
            }
        }

        System.out.println(returnValue);
    }
}
