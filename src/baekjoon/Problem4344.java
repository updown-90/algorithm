package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputValue = sc.nextInt();
        for (int i = 0; i < inputValue; i++) {
            int[] arr = new int[sc.nextInt()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            double sum = Double.parseDouble(String.valueOf(Arrays.stream(arr).sum()));
            double count = Arrays.stream(arr).filter(item -> item > sum / arr.length).count();
            double totalCount = arr.length;
            System.out.println(String.format("%.3f", (count / totalCount) * 100) + "%");

        }
    }

}
