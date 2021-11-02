package live;

public class BubbleSort {
    public static void main(String[] args) {
        int[] A = {13, 5, 11, 7, 23, 15};
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }

        for (int k : A) {
            System.out.println(k);
        }

    }
}
