Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

#code
class Solution {
    public static int search(int[] nums, int target) {

        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        search( nums,target); 
    }
}
