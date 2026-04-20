Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // fallback (though problem guarantees answer)
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();   // size of array
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        int target = scan.nextInt();

        Solution obj = new Solution();
        int[] result = obj.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
