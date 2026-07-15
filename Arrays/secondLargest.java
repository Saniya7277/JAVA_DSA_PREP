class Solution {
    public int secondLargestElement(int[] nums) {
        int max=0,secondmax=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                secondmax=max;
                max=nums[i];
            }
            else if(nums[i]>secondmax && nums[i]!=max){
                secondmax=nums[i];
            }
           

        }
        if(secondmax!=0)
        {
            return secondmax;
        }
        else{
            return -1;
        }

    
    }
}
