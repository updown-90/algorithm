package live;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
