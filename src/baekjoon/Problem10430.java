package baekjoon;

import java.util.Scanner;

public class Problem10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputValue = new int[3];

        for (int i = 0; i < inputValue.length; i++) {
            inputValue[i] = sc.nextInt();
        }

        System.out.println((inputValue[0]+inputValue[1])%inputValue[2]);
        System.out.println(((inputValue[0] % inputValue[2]) + (inputValue[1] % inputValue[2])) % inputValue[2]);
        System.out.println((inputValue[0]* inputValue[1])% inputValue[2]);
        System.out.println(((inputValue[0] % inputValue[2]) * (inputValue[1] % inputValue[2])) % inputValue[2]);
    }
}
