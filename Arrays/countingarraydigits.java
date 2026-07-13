class Solution {
    public static int findNumbers(int[] nums) {
        int counteven=0;
		
		for(int i=0;i<nums.length;i++)
		{
		    
		   int counter= countevendigit(nums[i]);
		   if(counter%2==0)
		   {
		      counteven++;
		   }
		}
		return counteven;
        
    }
    public static int countevendigit(int n)
	{
	    int count=0;
	    
	    while(n>0)
	    {
	        n=n/10;
	        count++;
	    }
	    return count;
	}
    public static void main(String[] args)
    {
        int[] nums={12,345,2,6,7896};
        int res=findNumbers(nums);
        System.out.println(res);


    }
}
