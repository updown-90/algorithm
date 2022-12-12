package baekjoon;

import java.util.*;
import java.util.stream.Collectors;

public class Problem2920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] sArr = inputString.split(" ");

        boolean asc = true;
        boolean desc = true;
        for (int i = 1; i < sArr.length; i++) {
            // 내림차순이면
            if (Integer.parseInt(sArr[i - 1]) > Integer.parseInt(sArr[i])) {
                asc = false;
            }
            // 오름차순이면
            else if (Integer.parseInt(sArr[i - 1]) < Integer.parseInt(sArr[i])) {
                desc = false;
            }

        }

        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
