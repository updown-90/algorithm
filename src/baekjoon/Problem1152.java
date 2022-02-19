package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        StringTokenizer st = new StringTokenizer(inputString, " ");

        System.out.println(st.countTokens());
    }
}

