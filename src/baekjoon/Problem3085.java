package baekjoon;

import java.util.Scanner;

public class Problem3085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[][] arr = new char[N][N];

        // 여기서 입력받은 2차원배열 만들어냈음
        for (int i = 0; i < N; i++) {
            String rowString = sc.next();
            for (int j = 0; j < rowString.length(); j++) {
                arr[i][j] = rowString.charAt(j);
            }
        }


    }
}

