package baekjoon;

import java.util.Scanner;

public class Problem2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputValue = sc.nextInt();

        int returnValue = 0;
        if (inputValue / 5 > 0) {
            returnValue += inputValue / 5;
            inputValue = inputValue % 5;
        }

        if (inputValue / 3 > 0) {
            returnValue += inputValue / 3;
            inputValue = inputValue % 3;
        }

        if (inputValue != 0) {
            System.out.println("-1");
            return;
        }

        System.out.println(returnValue);

    }
}


