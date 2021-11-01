package live;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int searchNumber = 65;
        int[] A = {12, 23, 32, 57, 65, 81, 87, 99};

        int left = 0;
        int right = A.length - 1;
        int mid;
        Arrays.sort(A);

        while (left <= right) {
            mid = (left + right) / 2;

            if (A[mid] == searchNumber) {
                System.out.println(mid);
                break;
            } else if (A[mid] < searchNumber) {
                left = mid + 1;
            } else if (A[mid] > searchNumber) {
                right = mid - 1;
            }
        }


    }
}
