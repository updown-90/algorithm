package baekjoon;

import java.util.*;

public class Problem1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        Map<String, Integer> characterMap = new HashMap<>();
        for (char aChar : chars) {
            characterMap.put(Character.toString(aChar).toUpperCase(), characterMap.getOrDefault(Character.toString(aChar).toUpperCase(), 0) + 1);
        }

        Map.Entry<String, Integer> maxMap = Collections.max(characterMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        int max = maxMap.getValue();

        int count = (int) characterMap.entrySet().stream().filter(entry -> entry.getValue() == max).count();

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(maxMap.getKey());
        }


    }
}
