package baekjoon;

import java.util.Scanner;


public class Problem10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.nextLine();
        String[] s = inputValue.split(" ");
        System.out.println(Integer.parseInt(s[0]) * Integer.parseInt(s[1]));
    }
}
