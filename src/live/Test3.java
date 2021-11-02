package live;

public class Test3 {
    public static void main(String[] args) {
        int[] A = {3, 2, -2, 5, -3};

        int returnValue = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == (A[j] * -1) && Math.abs(A[i]) > returnValue) {
                    returnValue = Math.abs(A[i]);
                }
            }
        }
        System.out.println(returnValue);
    }
}
