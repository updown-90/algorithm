package baekjoon;

import java.util.Scanner;

public class Problem2941 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();
        String[] wordArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : wordArr) {
            System.out.println(inputString.replaceAll(s, ""));

        }

    }
}


