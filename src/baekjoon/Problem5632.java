package baekjoon;

import java.util.Scanner;

public class Problem5632 {
    public static void main(String[] args) {
        String[] dialArr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};


        Scanner sc = new Scanner(System.in);
        int returnValue = 0;
        for (char c : sc.nextLine().toCharArray()) {
            for (int i = 0; i < dialArr.length; i++) {
                if (dialArr[i].contains(Character.toString(c))) {
                    returnValue += i + 3;
                }
            }
        }
        System.out.println(returnValue);
    }
}

