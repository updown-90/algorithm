package baekjoon;

import java.util.Scanner;

public class BurbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(buble_sort(arr));

    }

    private static int buble_sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
