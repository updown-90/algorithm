package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Problem1935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String prefix = sc.next();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Double> operand = new Stack<>();
        int len = prefix.length();
        for (int i = 0; i < len; i++) {
            char ch = prefix.charAt(i);
            if ('A' <= ch && ch <= 'Z') {  // operand
                double d = arr[ch - 'A'];
                operand.push(d);
            } else {  // operator
                double d1 = operand.pop();
                double d2 = operand.pop();
                double d3 = 0.0;
                switch (ch) {
                    case '+':
                        d3 = d2 + d1;
                        break;
                    case '-':
                        d3 = d2 - d1;
                        break;
                    case '*':
                        d3 = d2 * d1;
                        break;
                    case '/':
                        d3 = d2 / d1;
                        break;
                }
                operand.push(d3);
            }
        }
        System.out.printf("%.2f", operand.pop());
    }
}
