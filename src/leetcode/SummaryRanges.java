package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};

        List<String> result = new ArrayList<>();

        if(nums.length == 0){
            System.out.println(result);
        }

        int start = nums[0];
        int end = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                continue;
            } else {
                end = nums[i];

                if (start == end) {
                    result.add(String.valueOf(start));

                } else {
                    result.add(start + "->" + end);
                }

                if (i < nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }

        System.out.println(Arrays.toString(result.toArray()));
    }
}
