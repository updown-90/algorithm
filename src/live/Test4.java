package live;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] A = {13, 3, 2, 1};
        int[] B = {0, 1, 2, 3, 1};

        int n = A.length;
        int m = B.length;

        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (B[i] < A[k])
                i += 1;
            if (A[k] == B[i]){
                System.out.println(A[k]);
                return;
            }

        }
        System.out.println(-1);
    }
}
