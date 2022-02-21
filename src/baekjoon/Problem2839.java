package baekjoon;

import java.util.Scanner;

public class Problem2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputValue = sc.nextInt();

//        if (inputValue / 5 > 0) {
//            inputValue = inputValue % 5;
//        }
        System.out.println(inputValue / 5);
        System.out.println(inputValue % 5);

    }
}


