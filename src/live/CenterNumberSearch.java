package live;

import java.util.Arrays;

public class CenterNumberSearch {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.sort(A);

        if (A.length % 2 == 0) {
            int a = A.length / 2;
            float b = a + 1;
            System.out.println((a + b) / 2);
        } else {
            int a = A.length / 2;
            System.out.println(A[a]);
        }

    }
}
