package baekjoon;

import java.util.Scanner;

public class Problem1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        int oneCount = 0, zeroCount = 0;
        char pre = inputText.charAt(0);
        for (char c : inputText.toCharArray()) {
            if ('1' == c && c != pre) {
                oneCount++;
                pre = c;
                continue;
            }

            if ('0' == c && c != pre) {
                zeroCount++;
                pre = c;
                continue;
            }
        }

        System.out.println(oneCount);
        System.out.println(zeroCount);
    }
}


