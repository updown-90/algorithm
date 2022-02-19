package baekjoon;

import java.util.Scanner;

public class Problem2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {

            int num = sc.nextInt();
            String inputString = sc.next();

            for (int j = 0; j < inputString.length(); j++) {
                for (int k = 0; k < num; k++) {
                    System.out.print(inputString.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
