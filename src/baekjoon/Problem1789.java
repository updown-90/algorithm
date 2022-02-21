package baekjoon;

import java.util.Scanner;

public class Problem1789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long inputValue = sc.nextLong();

        int sum = 0;
        int count = 0;

        while (sum < inputValue) {
            sum = sum + count + 1;
            count++;
        }

        System.out.println(count - 1);

    }
}


