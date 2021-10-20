package codility;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        Arrays.sort(A);

        int returnValue;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + 1 != A[i + 1]){
                returnValue = A[i] + 1;
            }
        }

    }
}
