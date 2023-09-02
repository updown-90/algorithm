package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,4};

        Map<Integer, Integer> map = new HashMap<>();

        int maxValue = 0;
        String maxValueKey = "";
        for (Integer integer : nums) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
            if (map.get(integer) > maxValue) {
                maxValueKey = integer.toString();
                maxValue = map.get(integer);
            }
        }
        System.out.println(maxValueKey);

    }
}
