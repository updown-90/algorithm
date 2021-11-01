package live;

public class SelectionSort {
    public static void main(String[] args) {
        int[] A = {12, 23, 81, 57, 65, 89, 87, 99};

        for (int i = 0; i < A.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[min_index] > A[j]) {
                    min_index = j;
                }
            }
            int tmp = A[i];
            A[i] = A[min_index];
            A[min_index] = tmp;
        }

        for (int i : A) {
            System.out.print(i+",");
        }
    }
}
