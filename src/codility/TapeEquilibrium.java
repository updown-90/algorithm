package codility;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};

        int sum = 0;
        for(int i : A) sum += i;

        int left = 0;
        int right = 0;
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            left = left + A[i];
            right = sum - left;
            sumList.add(Math.abs(left - right));
        }

        System.out.println(Collections.min(sumList));
    }
}
