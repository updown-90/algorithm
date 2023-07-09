package leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
//        숫자 = [1,3,5,6], 대상 = 5

        int[] nums = {1, 3, 5, 6};
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println(i);
            }
        }

        if (nums[0] > target) {
            System.out.println(0);
        }

        for (int j = 1; j < nums.length; j++) {
            if (nums[j - 1] < target && nums[j] > target) {
                System.out.println(j);
            }
        }

        System.out.println(nums.length);
    }
}
