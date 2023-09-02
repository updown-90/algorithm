package baekjoon;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(select_sort(arr));

    }

    private static int select_sort(int[] arr) {
        int count = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return count;
    }
}
