package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aba", s = "dog cat cat";

        char[] chars = pattern.toCharArray();
        String[] s1 = s.split(" ");


        boolean returnValue = true;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            map.put(s1[i], map.getOrDefault(String.valueOf(s1[i]), 0) + 1);
            map2.put(String.valueOf(chars[i]), map2.getOrDefault(String.valueOf(chars[i]), 0) + 1);
            if (map2.get(String.valueOf(chars[i])) != map.get(s1[i])) {
                returnValue = false;
            }
        }

        System.out.println(returnValue);
    }
}
