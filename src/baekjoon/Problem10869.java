package baekjoon;

import java.util.Scanner;

public class Problem10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputValue = new int[2];

        for (int i = 0; i < inputValue.length; i++) {
            inputValue[i] = sc.nextInt();
        }
        System.out.println(inputValue[0] + inputValue[1]);
        System.out.println(inputValue[0] - inputValue[1]);
        System.out.println(inputValue[0] * inputValue[1]);
        System.out.println(inputValue[0] / inputValue[1]);
        System.out.println(inputValue[0] % inputValue[1]);

    }
}
