package baekjoon;

import java.util.Scanner;

public class problem2427 {

    public static int rec_fib(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i <= 2) {
            return 1;
        }

        return rec_fib(i - 1) + rec_fib(i - 2);
    }

    public static int memoization_fib(int i) {
        int[] fib_arr = new int[i + 1];

        fib_arr[0] = 0;
        fib_arr[1] = 1;

        for (int j = 2; j < fib_arr.length; j++) {
            fib_arr[j] = fib_arr[j - 2] + fib_arr[j - 1];
        }

        return fib_arr[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(rec_fib(sc.nextInt()));
        System.out.println(memoization_fib(sc.nextInt()));
    }
}
