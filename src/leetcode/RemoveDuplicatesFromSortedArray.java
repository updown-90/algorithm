package leetcode;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        int[] returns = new int[nums.length];
        int increaseNum = 0;
        int duplicateCount = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean duplicate = false;
            for (int aReturn : returns) {
                if (nums[i] == aReturn) {
                    duplicate = true;
                    duplicateCount++;
                }
            }

            if (!duplicate) {
                returns[increaseNum] = nums[i];
                increaseNum++;
            }
        }

        System.out.println(nums.length - duplicateCount);
    }
}
