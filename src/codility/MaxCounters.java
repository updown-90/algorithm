package codility;

import java.sql.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int N = 5;
        int[] arr = new int[N];

        for (int i : A) {
            int index = i - 1;
            if (i > N) {
                int max = Arrays.stream(arr).max().getAsInt();
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = max;
                }
            } else {
                arr[index] += 1;
            }
        }

        for (int i : arr) {
            System.out.print(i);
        }

    }
}
