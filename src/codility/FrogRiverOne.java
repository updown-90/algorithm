package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;

        Set<Integer> set = new HashSet<>();
        int returnValue = 0;
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (A[i] == X && set.size() == i + 1) {
                returnValue = i;
            }
        }

        System.out.println(-1);
    }
}
