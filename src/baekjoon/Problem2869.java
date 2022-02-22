package baekjoon;

import java.util.Scanner;

public class Problem2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();

        int count = 0;
        int sum = up-down;
        while (sum < height) {
            sum += sum;
            count++;
        }

        System.out.println(count+1);


    }
}


