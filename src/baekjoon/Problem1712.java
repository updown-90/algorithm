package baekjoon;

import java.util.Scanner;

public class Problem1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputValue = sc.nextLine();
        String[] inputValueArr = inputValue.split(" ");

        int A = Integer.parseInt(inputValueArr[0]);
        int B = Integer.parseInt(inputValueArr[1]);
        int C = Integer.parseInt(inputValueArr[2]);

        if (C <= B) {
            System.out.println("-1");
            return;
        }

        System.out.println(A / (C - B) + 1);

    }
}


