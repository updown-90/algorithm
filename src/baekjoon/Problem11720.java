package baekjoon;

import java.util.Scanner;

public class Problem11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputValue = sc.nextInt();
        sc.nextLine();
        char[] chars = sc.nextLine().toCharArray();

        int sum = 0;
        for (int i = 0; i < inputValue; i++) {
            sum += Integer.parseInt(String.valueOf(chars[i]));
        }
        System.out.println(sum);
    }
}
