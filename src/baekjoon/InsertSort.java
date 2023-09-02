package baekjoon;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(insert_sort(arr));

    }

    private static int insert_sort(int[] arr) {
        int count = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return count;
    }
}
