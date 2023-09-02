package baekjoon;

import java.util.Scanner;

public class Problem15649 {

    static int N;
    static int M;
    static int[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        used = new int[N];

        dfs(1);

    }

    private static void dfs(int i) {

    }
}
