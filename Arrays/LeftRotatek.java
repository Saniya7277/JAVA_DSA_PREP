class Solution {
    public void rotateArray(int[] nums, int k) {
        k=k%nums.length;
        for(int i=0;i<k;i++)
        {
            rotate(nums);
        }

        
    }
    static void rotate(int[] nums){
        int temp=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
}
