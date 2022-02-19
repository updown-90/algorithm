package baekjoon;

import java.util.Scanner;

public class Problem1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        int topCount = 0;
        for (int i = 0; i < chars.length; i++) {
            int tmpCount = 0;
            for (char aChar : chars) {
                if (Character.toString(aChar).equalsIgnoreCase(Character.toString(chars[i]))) {
                    tmpCount++;
                }
            }
        }
        System.out.println(topCount);
    }
}
