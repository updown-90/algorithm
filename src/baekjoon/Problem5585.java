package baekjoon;

import java.util.Scanner;

public class Problem5585 {
    public static void main(String[] args) {

        int[] cashArr = {500, 100, 50, 10, 5, 1};
        Scanner sc = new Scanner(System.in);

        int inputValue = 1000 - sc.nextInt();


        int count = 0;
        while (inputValue > 0) {
            if (inputValue >= 500) {
                count += inputValue / 500;
                inputValue = inputValue % 500;
                continue;
            }

            if (inputValue >= 100) {
                count += inputValue / 100;
                inputValue = inputValue % 100;
                continue;
            }

            if (inputValue >= 50) {
                count += inputValue / 50;
                inputValue = inputValue % 50;
                continue;
            }

            if (inputValue >= 10) {
                count += inputValue / 10;
                inputValue = inputValue % 10;
                continue;
            }

            if (inputValue >= 5) {
                count += inputValue / 5;
                inputValue = inputValue % 5;
                continue;
            }

            if (inputValue >= 1) {
                count += inputValue / 1;
                inputValue = inputValue % 1;
                continue;
            }
        }

        System.out.println(count);
    }
}


