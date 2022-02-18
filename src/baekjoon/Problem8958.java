package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        List<String> inputArr = new ArrayList<>();

        for (int i = 0; i < inputValue; i++) {
            inputArr.add(sc.next());
        }

        for (String s : inputArr) {
            int totalSum = 0;
            int tmpSum = 0;
            for (char s1 : s.toCharArray()) {
                if (s1 == 'O') {
                    tmpSum++;
                } else {
                    tmpSum = 0;
                }
                totalSum += tmpSum;
            }
            System.out.println("totalSum = " + totalSum);
        }
    }
}
