package baekjoon;

import java.util.Scanner;

public class Problem2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] sArr = inputString.split(" ");

        int max = 0;
        for (String s : sArr) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            int tmp = Integer.parseInt(String.valueOf(sb));
            if (tmp > max) {
                max = tmp;
            }
        }
        System.out.println(max);


    }
}

