package baekjoon;

import java.util.Scanner;

public class Problem10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 350;
        int B = 60;
        int C = 10;

        int countA = 0, countB = 0, countC = 0;

        int inputSecond = sc.nextInt();


        if (inputSecond >= A) {
            countA += inputSecond / A;
            inputSecond = inputSecond % A;
        }

        if (inputSecond >= B) {
            countB += inputSecond / B;
            inputSecond = inputSecond % B;
        }

        if (inputSecond >= C) {
            countC += inputSecond / C;
            inputSecond = inputSecond % C;
        }

        if (inputSecond != 0) {
            System.out.println(-1);
        } else {
            System.out.print(countA + " " + countB + " " + countC);
        }


    }
}


