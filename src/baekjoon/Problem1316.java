package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputValue = sc.nextInt();

        int returnValue = 0;
        for (int i = 0; i < inputValue; i++) {
            char prev = 0;
            boolean group = true;
            List<Character> characterList = new ArrayList<>();
            for (char c : sc.next().toCharArray()) {
                if (c != prev && characterList.stream().anyMatch(item -> item == c)) {
                    group = false;
                }

                if (prev != c) {
                    characterList.add(c);
                }

                prev = c;
            }

            if (group) {
                returnValue++;
            }
        }
        System.out.println(returnValue);
    }
}


